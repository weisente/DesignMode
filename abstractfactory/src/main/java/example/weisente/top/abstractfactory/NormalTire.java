package example.weisente.top.abstractfactory;

/**
 * Created by san on 2017/12/29.
 */

public class NormalTire implements ITire  {
    @Override
    public void tire() {
        System.out.println("普通轮胎");
    }
}
