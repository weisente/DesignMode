package example.weisente.top.singleton;

/**
 * Created by san on 2017/12/29.
 * 静态内部类也是可以实现的而且是最佳实现
 * 为什么呢
 *
 * 当这个类被加载的时候 Static 并不会去加载instance
 * 只有第一次调用getInstance 的时候 才会去创建单例
 * 这种方式不仅能够保证线程安全，也能保证单例对象的唯一性，同时也延长了单例的实例化。
 */

public class Static {

    private Static() {

    }

    public static Static getInstance() {
        return StaticHolder.instance;
    }

    private static class StaticHolder {
        private static final Static instance = new Static();
    }

}
