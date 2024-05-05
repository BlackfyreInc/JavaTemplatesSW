package T_3_1;

public class Client {
    public static void main(String[] args) {
        Lamp Lamp1 = new Lamp("Lamp 1");
        Lamp Lamp2 = new Lamp("Lamp 2");
        Command Lamp1Command = new LampCommand(Lamp1);
        Command Lamp2Command = new LampCommand(Lamp2);
        Controller controllerLamp1Command = new Controller();
        Controller controllerLamp2Command = new Controller();
        controllerLamp1Command.setCommand(Lamp1Command);
        controllerLamp2Command.setCommand(Lamp2Command);

        controllerLamp1Command.on();
        controllerLamp1Command.off();

        controllerLamp2Command.on();
        controllerLamp2Command.off();
    }
}
