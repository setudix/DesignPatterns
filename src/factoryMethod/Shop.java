package factoryMethod;

public class Shop {
    public static void main(String[] args) {
        PcCreator pcCreator = new WorkstationPcCreator();
        pcCreator.sendForDelivery();
    }
}
