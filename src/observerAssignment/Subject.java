package observerAssignment;

import java.util.ArrayList;

public abstract class Subject {
    private ArrayList<Observer> list = new ArrayList<>();

    public void register(Observer o){
        list.add(o);
    }
    public void unregister(Observer o){
        list.remove(o);
    }
    protected void notifyObservers(){
        for (Observer o : list){
            o.update();
        }
    }
}
