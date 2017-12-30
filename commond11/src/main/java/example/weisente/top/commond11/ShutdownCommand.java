package example.weisente.top.commond11;

import android.util.Log;

/**
 * Created by san on 2017/12/30.
 */

public class ShutdownCommand  implements Command {
    @Override
    public void execute() {
        Log.v("tag", "关闭计算机");
    }
}
