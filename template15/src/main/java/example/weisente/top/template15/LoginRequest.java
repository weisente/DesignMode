package example.weisente.top.template15;

import android.util.Log;

/**
 * Created by san on 2017/12/30.
 */

public class LoginRequest extends BaseRequest {
    @Override
    protected String getMethod() {
        return "loginRequestFunction";
    }

//    Observable.


    @Override
    public void createRequest() {
        super.createRequest();
        Log.v("tag", "创建请求");
    }

    @Override
    public void post(RequestParams params) {
        super.post(params);
        Log.v("tag", "====登录=====");
    }
}
