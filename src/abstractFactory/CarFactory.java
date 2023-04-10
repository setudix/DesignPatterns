package abstractFactory;

public class CarFactory implements VehicleFactory{
    @Override
    public Engine createEngine() {
        return new CarEngine();
    }

    @Override
    public Body createBody() {
        return new CarBody();
    }
}
