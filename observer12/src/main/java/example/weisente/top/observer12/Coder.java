package example.weisente.top.observer12;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by san on 2017/12/30.
 */

public class Coder implements Observer {

    public String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Log.v("tag", name+o);
    }
}
