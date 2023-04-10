package abstractFactory;

public class Client {
    public static void main(String[] args) {
        VehicleFactory factory = new CngFactory();
        Body body = factory.createBody();
        Engine engine = factory.createEngine();

        System.out.println(body.getName());
        System.out.println(engine.getName());
    }
}
