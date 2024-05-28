package T3_1;
public class Plane {

  private boolean isInTheAir;
  private final int id;
  private final Mediator mediator;


  public Plane(int id, Mediator mediator) {
    this.id = id;
    this.mediator = mediator;
    isInTheAir = false;
    ((FlightControlMediator) mediator).addPlane(this);
  }
  public void takeOff() {
    mediator.notify(Event.TAKE_OFF, id);
  }
  public void land() {
    mediator.notify(Event.LAND, id);
  }
  public boolean getIsInTheAir() {
    return isInTheAir;
  }

  public void setIsInTheAir(boolean isInTheAir) {
    this.isInTheAir = isInTheAir;
  }

  public int getId() {
    return id;
  }
}
