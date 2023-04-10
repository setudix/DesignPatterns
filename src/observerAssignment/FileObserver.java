package observerAssignment;

public class FileObserver extends Observer{
    private int id;
    FileObserver(int id){
        this.id = id;
    }
    @Override
    public void update() {
        System.out.println(id + ": File has been changed.");
    }
}
