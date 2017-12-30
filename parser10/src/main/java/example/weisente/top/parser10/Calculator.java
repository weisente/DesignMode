package example.weisente.top.parser10;

import java.util.Stack;

/**
 * Created by san on 2017/12/30.
 */

public class Calculator {

    //声明一个Stack栈储存并操作所有相关的解释器
    private Stack<ArithemticExpression> mExpStack = new Stack<ArithemticExpression>();


    public Calculator(String expression){
        //临时的操作数
        ArithemticExpression exp1,exp2;
        //取得不同的操作符号
        String[] elements = expression.split(" ");

        for(int i = 0; i < elements.length; i++){
            switch (elements[i].charAt(0)) {
                case '+':
                    //如果是加号，则将栈中的解释器弹出作为运算符号左边的解释器
                    exp1 = mExpStack.pop();
                    //同时将运算符号数组下标的下一个元素构造为一个数字解释器
                    exp2 = new NumExpression(Integer.parseInt(elements[++i]));
                    //通过上面的两个数字解释器构造加法运算解释器
                    mExpStack.push(new AdditionExpression(exp1, exp2));
                    break;

                default:
                /*
                 * 如果为数字，直接构造数字解释器并压入栈
                 */
                    mExpStack.push(new NumExpression(Integer.valueOf(elements[i])));
                    break;
            }
        }
    }
}
