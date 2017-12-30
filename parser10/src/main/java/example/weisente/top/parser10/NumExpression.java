package example.weisente.top.parser10;

/**
 * Created by san on 2017/12/30.
 * 这个是数值的操作符
 * 主要作用在于把进行转换
 */

public class NumExpression extends ArithemticExpression{

    private int num;

    public NumExpression(int num){
        this.num = num;
    }


    @Override
    public int interpreter() {
        return num;
    }
}
