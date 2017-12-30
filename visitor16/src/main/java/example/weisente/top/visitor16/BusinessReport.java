package example.weisente.top.visitor16;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by san on 2017/12/30.
 */

public class BusinessReport {
    List<Staff> mStaffs = new LinkedList<Staff>();


    public BusinessReport(){
        mStaffs.add(new Manager("王经理"));
        mStaffs.add(new Engineer("攻城狮-A"));
        mStaffs.add(new Engineer("攻城狮-B"));
        mStaffs.add(new Manager("李经理"));
        mStaffs.add(new Engineer("攻城狮-C"));
    }

    public void showReport(IVisitor visitor){
        for(Staff staff : mStaffs){
            staff.accept(visitor);
        }
    }
}
