package example.weisente.top.observer12;

import java.util.Observable;

/**
 * Created by san on 2017/12/30.
 */

public class Weixin extends Observable {

    //发布更新消息
    public void sendMessages(String msg) {
        setChanged();
        notifyObservers(msg);
    }
}
