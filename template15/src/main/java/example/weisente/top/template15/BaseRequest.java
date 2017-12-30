package example.weisente.top.template15;

/**
 * Created by san on 2017/12/30.
 */

public abstract class BaseRequest implements IBaseRequest {

    protected abstract String getMethod();

    @Override
    public void createRequest() {

    }

    @Override
    public void get() {

    }

    @Override
    public void post(RequestParams params) {

    }
}
