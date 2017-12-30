package example.weisente.top.visitor16;

/**
 * Created by san on 2017/12/30.
 *
 *
 */

public interface IVisitor {
    /**
     * 访问攻城狮类型
     */
    void visit(Engineer engineer);

    /**
     * 访问经理类型
     */
    void visit(Manager manager);
}
