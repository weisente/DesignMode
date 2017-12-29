package example.weisente.top.singleton;

/**
 * Created by user on 2017/10/24.
 * DCL单例（双重检查锁定）
 * 这种写法在getSingleton方法中对singleton进行了两次判空，第一次是为了不必要的同步，第二次是为了在null的情况下创建实例。
 * 我们会发现上面代码有一个volatile关键字，因为在这里会有DCL失效问题，原因是Java编译器允许处理器乱序执行。
 * 那么为了解决这个问题，在JDK1.5之后，具体化了volatile关键字，只要定义时加上他，可以保证执行的顺序，虽然会影响性能。
 * 这种方式第一次加载时会稍慢，在高并发环境会有缺陷，但是一般能够满足需求。
 */

public class DoubleCheck {
    private volatile static DoubleCheck instance;

    private DoubleCheck() {
    }

    public synchronized static DoubleCheck getInstance() {
        if (null == instance) {
            synchronized (DoubleCheck.class) {
                if (null == instance) {
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}
