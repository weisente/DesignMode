package example.weisente.top.abstractfactory;

/**
 * Created by san on 2017/12/29.
 */

public class AFactory extends CarFactory {
    @Override
    public ITire createTire() {
        return null;
    }

    @Override
    public IEngine createEngine() {
        return null;
    }
}
