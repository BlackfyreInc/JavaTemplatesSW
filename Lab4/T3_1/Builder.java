package task_3_1;


public interface Builder {
    void setBodyType(BodyType bodyType);
    void setColor(String color);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setWheel(Wheel wheel);
    Car build();
}
