package example.weisente.top.singleton;

/**
 * Created by san on 2017/12/29.
 * 饿汉式  这的确保证了单利
 * 而且节省了第一次调用时间
    饿汉式在类创建的同时就实例化一个静态对象出来，不管之后会不会使用这个单例
 * ，都会占据一定的内存，但是相应的，在第一次调用时速度也会更快，因为其资源已经初始化完成，
 */

public class Hungry {
    private static Hungry instance = new Hungry();

    private Hungry() {
    }

    public Hungry getInstance() {
        return instance;
    }
}
