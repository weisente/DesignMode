package example.weisente.top.singleton;

/**
 * Created by san on 2017/12/29.
 *
 * 懒汉式
 *
 * 懒汉式顾名思义，会延迟加载，在第一次使用该单例的时候才会实例化对象出来，
 * 第一次调用时要做初始化，如果要做的工作比较多，性能上会有些延迟，之后就和饿汉式一样了。
 * 这种写法能够在多线程中很好的工作，但是每次调用getInstance方法都会进行同步，反应稍慢，还会造成不必要的开销，所以者这种不建议使用。
 */

public class Lazy {
    public static Lazy instance;

    private Lazy() {
    }

    public static synchronized Lazy getInstance() {
        if (null == instance) {
            instance = new Lazy();
        }
        return instance;
    }
}
