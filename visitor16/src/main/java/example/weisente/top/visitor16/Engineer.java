package example.weisente.top.visitor16;

import java.util.Random;

/**
 * Created by san on 2017/12/30.
 */

public class Engineer extends Staff {

    private int codeLines;//代码数量

    public Engineer(String name) {
        super(name);
        codeLines = new Random().nextInt(10 * 10000);
    }

    @Override
    public void accept(IVisitor visitor) {

    }

    public int getCodeLines(){
        return codeLines;
    }
}
