package example.weisente.top.duty9;

/**
 * Created by san on 2017/12/29.
 */

public class GroupLeader extends Leader{
    @Override
    public int limit() {
        return 1000;
    }

    @Override
    public void handle(int money) {
        System.out.println("组长批复报销"+ money +"元");
    }

    @Override
    public String getLeader() {
        return "当前是组长";
    }
}
