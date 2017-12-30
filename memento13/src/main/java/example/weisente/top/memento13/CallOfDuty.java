package example.weisente.top.memento13;

/**
 * Created by san on 2017/12/30.
 */

public class CallOfDuty {

    private int mCheckpoint = 1;

    private int mLiftValue = 100;

    private String mWeapon = "沙漠之鹰";

    //玩游戏
    public void play(){
        System.out.println("打游戏："+String.format("第%d关", mCheckpoint) + "奋战杀敌中");
        mLiftValue -= 10;
        System.out.println("进度升级了");
        mCheckpoint++;
        System.out.println("到达" + String.format("第%d关", mCheckpoint));
    }

    //退出游戏
    public void quit(){
        System.out.println("--------------");
        System.out.println("退出前的游戏属性：" + this.toString());
        System.out.println("退出游戏");
        System.out.println("--------------");
    }

    /**
     *创建备忘录
     */
    public Memoto createMemoto(){
        Memoto memoto = new Memoto();
        memoto.mCheckpoint = mCheckpoint;
        memoto.mLiftValue = mLiftValue;
        memoto.mWeapon = mWeapon;
        return memoto;
    }

    //恢复游戏
    public void restore(Memoto Memoto){
        this.mCheckpoint = Memoto.mCheckpoint;
        this.mLiftValue = Memoto.mLiftValue;
        this.mWeapon = Memoto.mWeapon;
        System.out.println("恢复后的游戏属性：" + this.toString());
    }

    //省略getter和setter方法

    @Override
    public String toString() {
        return "CallOfDuty [mCheckpoint=" + mCheckpoint + ",mLiftValue="
                + mLiftValue + ",mWeapon=" + mWeapon + "]";
    }
}
