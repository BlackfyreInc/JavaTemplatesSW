package T_3_2;

public class Menu {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void select() {
        command.execute();
    }
}
