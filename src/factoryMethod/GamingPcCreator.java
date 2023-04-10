package factoryMethod;

public class GamingPcCreator extends PcCreator{
    @Override
    protected Pc createPC() {
        return new GamingPc();
    }
}
