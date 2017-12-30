package example.weisente.top.abstractfactory;

/**
 * Created by san on 2017/12/29.
 */

public abstract class CarFactory {

    public abstract ITire createTire();

    public abstract IEngine createEngine();
}
