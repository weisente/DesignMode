package example.weisente.top.parser10;

/**
 * Created by san on 2017/12/30.
 */

public class AdditionExpression extends OperatorExpression {

    public AdditionExpression(ArithemticExpression exp1, ArithemticExpression exp2) {
        super(exp1, exp2);
    }

    @Override
    public int interpreter() {
        //这个是加法的运算
        return exp1.interpreter() + exp2.interpreter();
    }
}
