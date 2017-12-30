package example.weisente.top.proxy18;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by san on 2017/12/30.
 */

public class DynamicPorxy implements InvocationHandler {

    private Object obj; //被代理类的引用

    public DynamicPorxy(Object obj) {
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(obj, args);
        return result;
    }
}
