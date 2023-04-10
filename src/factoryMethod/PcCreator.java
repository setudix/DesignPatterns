package factoryMethod;

public abstract class  PcCreator {
    private Pc pc;

    protected abstract Pc createPC();

    public void sendForDelivery(){
        pc = createPC();
        System.out.println(pc.getName() + " created and sent for delivery");
    }
}
