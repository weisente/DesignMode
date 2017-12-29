package example.weisente.top.designmode.八大原则.example1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by san on 2017/12/29.
 */

public class DiskCache {
    static String cacheDir = "sdcard/cache";

    public Bitmap get(String url){
        return BitmapFactory.decodeFile(url);
    }

    public void put(String url ,Bitmap bitmap){
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(url);
            boolean compress = bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
