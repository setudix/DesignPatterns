package abstractFactory;

public class CngFactory implements VehicleFactory{
    @Override
    public Engine createEngine() {
        return new CngEngine();
    }

    @Override
    public Body createBody() {
        return new CngBody();
    }
}
