package example.weisente.top.observer12;

/**
 * Created by san on 2017/12/30.
 */

public interface IObservable {
    //发消息
    void sendMessage(String message);
    //订阅
    void addObserver(IObserver observer);
}
