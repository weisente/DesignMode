package example.weisente.top.state8;

import android.content.Context;
import android.content.Intent;

/**
 * Created by san on 2017/12/29.
 */

public class LogoutState implements State  {
    @Override
    public void forward(Context context) {
        context.startActivity(new Intent(context, LoginActivity.class));
    }
}
