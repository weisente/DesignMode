package example.weisente.top.designmode.八大原则.example1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * Created by san on 2017/12/8.
 * ImageLoader2  相对于ImageLoader 优势在于把ImageCache提取出来
 */

public class ImageLoader4 {
//    LruCache<String, Bitmap> mImageCache;
//  根据手机的核数 决定线程的数量
    ExecutorService mExecutorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    ImageCache imageCache = new ImageCache();
    DiskCache diskCache = new DiskCache();
    //
    boolean isUseDiskCahe = false;

    public void useDiskCache(boolean b){
        isUseDiskCahe = b;
    }




    public void displayImage(final String url, final ImageView imageView){
        //做一个标记
        imageView.setTag(url);
        //这里有问题
        mExecutorService.submit(new Runnable() {
            @Override
            public void run() {
                Bitmap bitmap;
                bitmap = isUseDiskCahe ? diskCache.get(url):imageCache.get(url);

                if(bitmap == null){
                    bitmap = dowmloadImage(url);
                }

                if(bitmap == null){
                    return;
                }

                if(imageView.getTag().equals(url)){
                    //居然在子线程里面运行
                    imageView.setImageBitmap(bitmap);
                }
                imageCache.put(url,bitmap);
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
