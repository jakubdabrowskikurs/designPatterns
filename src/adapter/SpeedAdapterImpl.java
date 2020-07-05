package adapter;

public class SpeedAdapterImpl implements SpeedAdapter {

    private SpeedInMPH vehicle;

    public SpeedAdapterImpl(SpeedInMPH vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(vehicle.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.6;
    }
}
