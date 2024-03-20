public interface Bus extends Car {
    @Override
    Long getVehicleCost();

    @Override
    Long getDistanceCost(Long distance);
}
