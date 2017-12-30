package example.weisente.top.commond11;

import android.util.Log;

/**
 * Created by san on 2017/12/30.
 */

public class Receiver {


    public void toLeft(){
        Log.v("tag", "向左=====");

    }
    public void toRight(){
        Log.v("tag", "向右=====");
    }

    //增加功能，只需要再新增一个命令就好了
    public void shutdown(){
        Log.v("tag", "关闭====");
    }
}
