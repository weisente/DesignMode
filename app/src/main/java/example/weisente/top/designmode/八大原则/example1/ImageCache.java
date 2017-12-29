package example.weisente.top.designmode.八大原则.example1;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * Created by san on 2017/12/29.
 */

public class ImageCache {
    LruCache<String,Bitmap> mImageCache;
    public ImageCache(){
        initImageCache();
    }

    private void initImageCache() {

        int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
        int cache = maxMemory / 4;

        mImageCache = new LruCache<String, Bitmap>(cache) {
            @Override
            protected int sizeOf(String key, Bitmap bitmap) {

                return bitmap.getRowBytes() * bitmap.getHeight() / 1024;
            }
        };
    }

    public void put(String url , Bitmap bitmap){
        mImageCache.put(url,bitmap);
    }

    public Bitmap get(String url){
        return mImageCache.get(url);
    }
}
