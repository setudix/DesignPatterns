package abstractFactory;

public interface VehicleFactory {
    Engine createEngine();
    Body createBody();
}
