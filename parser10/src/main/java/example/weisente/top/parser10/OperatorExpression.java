package example.weisente.top.parser10;

/**
 * Created by san on 2017/12/30.
 * 操作的表达式
 */

public abstract class OperatorExpression  extends ArithemticExpression{

    protected ArithemticExpression exp1, exp2;

    public OperatorExpression(ArithemticExpression exp1, ArithemticExpression exp2){
        this.exp1 = exp1;
        this.exp2 = exp2;
    }
}
