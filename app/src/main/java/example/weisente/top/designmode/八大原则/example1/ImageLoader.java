package example.weisente.top.designmode.八大原则.example1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.LruCache;
import android.widget.ImageView;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * Created by san on 2017/12/8.
 */

public class ImageLoader {
    LruCache<String, Bitmap> mImageCache;
//  根据手机的核数 决定线程的数量
    ExecutorService mExecutorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    public ImageLoader() {
        //最大的缓存
        int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
        int cache = maxMemory / 4;
        //LruCache里面设置大小
        mImageCache = new LruCache<String, Bitmap>(cache) {
            @Override
            protected int sizeOf(String key, Bitmap bitmap) {

                return bitmap.getRowBytes() * bitmap.getHeight() / 1024;
            }
        };

//        LayoutInflater.from()
        
    }
    public void displayImage(final String url, final ImageView imageView){
        //做一个标记
        imageView.setTag(url);
        //这里有问题
        mExecutorService.submit(new Runnable() {
            @Override
            public void run() {
                Bitmap bitmap = dowmloadImage(url);
                if(bitmap == null){
                    return;
                }

                if(imageView.getTag().equals(url)){
                    //居然在子线程里面运行
                    imageView.setImageBitmap(bitmap);
                }
                mImageCache.put(url,bitmap);
            }
        });
    }

    public Bitmap dowmloadImage(String imageUrl){
        Bitmap bitmap = null;
        try {
            URL url = new URL(imageUrl);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            bitmap = BitmapFactory.decodeStream(httpURLConnection.getInputStream());
            httpURLConnection.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bitmap;

    }
}
