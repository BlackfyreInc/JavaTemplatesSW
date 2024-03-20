public interface Tramway extends Car {
    @Override
    Long getVehicleCost();
    Long getDistanceCost(Long distance);
}
