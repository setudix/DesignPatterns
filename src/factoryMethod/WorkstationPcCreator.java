package factoryMethod;

public class WorkstationPcCreator extends PcCreator{
    @Override
    protected Pc createPC() {
        return new WorkstationPc();
    }
}
