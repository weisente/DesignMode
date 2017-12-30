package example.weisente.top.observer12;

import android.util.Log;

/**
 * Created by san on 2017/12/30.
 */

public class Person implements IObserver {

    public String name;
    public Person(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {
        Log.v("tag", name+message);
    }
}
