package example.weisente.top.observer12.test;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by san on 2017/12/30.
 */

public class Coder1 implements Observer {

    public String name;


    @Override
    public void update(Observable o, Object arg) {
        Log.e("tag"," hi " + name + ", DevTechFrontier 更新了"+ arg);
    }

    @Override
    public String toString() {
        return "码农"+name;
    }
}
