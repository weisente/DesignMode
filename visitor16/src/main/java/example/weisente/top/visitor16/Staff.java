package example.weisente.top.visitor16;

import java.util.Random;

/**
 * Created by san on 2017/12/30.
 */

public abstract class Staff {
    //员工姓名
    public String name;
    //员工KPI
    public int kpi;

    public Staff(String name) {
        super();
        this.name = name;
        this.kpi = new Random().nextInt(10);
    }

    //接受Visitor的访问
    public abstract void accept(IVisitor visitor);
}
