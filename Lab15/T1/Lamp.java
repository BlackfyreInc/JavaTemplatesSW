package T_3_1;

public class Lamp {

    final private String name;
    private boolean isLightOn;

    public Lamp(String name) {
        this.name = name;
        this.isLightOn = false;
    }

    public Lamp() {
        this("neutral");
    }

    public void lightOn() {
        if (isLightOn) {
            return;
        }
        System.out.println(": Light is on in " + name);
        isLightOn = true;
    }

    public void lightOff() {
        if (!isLightOn) {
            return;
        }
        System.out.println(": Light is off in " + name);
        isLightOn = false;
    }
}
