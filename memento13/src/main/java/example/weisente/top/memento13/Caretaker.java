package example.weisente.top.memento13;

/**
 * Created by san on 2017/12/30.
 * 备忘录管理类：
 *
 */

public class Caretaker {
    Memoto mMemoto; //备忘录

    /**
     * 存档
     */
    public void archive(Memoto memento) {
        this.mMemoto = memento;
    }

    /**
     * 获取存档
     */
    public Memoto getMemento() {
        return mMemoto;
    }
}
