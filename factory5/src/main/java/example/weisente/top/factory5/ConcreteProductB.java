package example.weisente.top.factory5;

import android.util.Log;

/**
 * Created by san on 2017/12/29.
 */

public class ConcreteProductB extends Product {
    @Override
    public void create() {
        Log.v("tag", "创建产品B");
    }
}
