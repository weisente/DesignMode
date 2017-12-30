package example.weisente.top.commond11;

/**
 * Created by san on 2017/12/30.
 */

public class RightCommand implements Command {

    private Receiver receiver;

    public RightCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.toRight();
    }
}
