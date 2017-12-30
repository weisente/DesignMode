package example.weisente.top.state8;

import android.content.Context;

/**
 * Created by san on 2017/12/29.
 */

public class LoginTools {
//    public static LoginTools instance;

    private LoginTools(){

    }

    static class  LoginHolder{
        private static final LoginTools ins = new LoginTools();
    }

    public static LoginTools getInstance(){
        return  LoginHolder.ins;
    }
    private State mState = new LogoutState();

    public void setState(State state){
        this.mState = state;
    }

    public void forward(Context context){
        mState.forward(context);
    }



}
