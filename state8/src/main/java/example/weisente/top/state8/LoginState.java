package example.weisente.top.state8;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by san on 2017/12/29.
 *
 *
 */

public class LoginState implements State  {
    @Override
    public void forward(Context context) {
        Toast.makeText(context, "转发", Toast.LENGTH_SHORT).show();
    }
}
