package example.weisente.top.duty9;

/**
 * Created by san on 2017/12/29.
 */

public  abstract class Leader {
    //下一级的处理者
    protected Leader nextHandler;

    public final void handleRequest(int money){
        System.out.println(getLeader());
        if (money <= limit()) {
            handle(money);
        } else {
            System.out.println("报账额度不足，提交领导");
            if (null != nextHandler) {
                nextHandler.handleRequest(money);
            }
        }
    }

    public abstract int limit();

    public abstract void handle(int money);

    public abstract String getLeader();
}
