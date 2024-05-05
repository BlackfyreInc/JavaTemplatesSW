public class CarBuilder {

    private final EngineFlyweight engineFlyweight = new EngineFlyweight();
    private final WheelFlyweight wheelFlyweight = new WheelFlyweight();

    public CarBuilder setType(Car.Type type) {
        this.type = type;
        return this;
    }

    public CarBuilder setCarColor(Car.CarColor carColor) {
        this.carColor = carColor;
        return this;
    }

    public CarBuilder setEngine(int power, Engine.Fuel fuel) {
        this.engine = engineFlyweight.getEngine(power, fuel);
        return this;
    }

    public CarBuilder setWheel(int diameter) {
        this.wheel = wheelFlyweight.getWheel(diameter);
        return this;
    }

    private Car.Type type;
    private Car.CarColor carColor;
    private Engine engine;
    private Wheel wheel;

    public CarBuilder reset() {
        type = Car.Type.SUV;
        carColor = Car.CarColor.Black;
        engine = engineFlyweight.getEngine(215, Engine.Fuel.Petrol);
        wheel = wheelFlyweight.getWheel(15);
        return this;
    }

    public CarBuilder() {
        reset();
    }

    public Car build() {

        if (type == null || carColor == null || engine == null || wheel == null) {
            throw new IllegalArgumentException();
        }

        return new Car(type, carColor, engine, wheel);
    }

}
