package example.weisente.top.mediator17.abs;

/**
 * Created by san on 2017/12/30.
 */

public class Colleague {
    protected Mediator mediator;//每一个同事都该知道其中介者

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
