package T3_1;

public class Main {

  public static void main(String[] args) {
    FlightControlMediator mediator = new FlightControlMediator();
    Plane plane = new Plane(322, mediator);
    plane.takeOff();
  }
}
