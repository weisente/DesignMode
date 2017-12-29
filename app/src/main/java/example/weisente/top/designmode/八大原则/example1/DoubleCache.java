package example.weisente.top.designmode.八大原则.example1;

import android.graphics.Bitmap;

/**
 * Created by san on 2017/12/29.
 */

public class DoubleCache {
//    new ImageCache();
//    new DiskCache();
    ImageCache imageCache = new ImageCache();
    DiskCache diskCache =  new DiskCache();

    public Bitmap get(String url){
        Bitmap bitmap = imageCache.get(url);
        if(bitmap == null){
            bitmap = diskCache.get(url);
        }
        return bitmap;
    }

    public void put(String url,Bitmap bitmap){
        imageCache.put(url,bitmap);
        diskCache.put(url,bitmap);
    }

}
