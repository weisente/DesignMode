package example.weisente.top.visitor16;

/**
 * Created by san on 2017/12/30.
 */

public class CTOVisitor implements IVisitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("攻城狮：" + engineer.name + ", 代码数量:" + engineer.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理：" + manager.name +", 产品数量 ：" + manager.getProducts());
    }
}
