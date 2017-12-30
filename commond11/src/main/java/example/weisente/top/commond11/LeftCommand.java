package example.weisente.top.commond11;

/**
 * Created by san on 2017/12/30.
 */

public class LeftCommand implements Command {

    private Receiver receiver;
    public LeftCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.toLeft();
    }
}
