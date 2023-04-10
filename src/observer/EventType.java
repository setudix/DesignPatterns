package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class EventType {
    private ArrayList<Observer> list = new ArrayList<>();

    public void attach(Observer o){
        list.add(o);
    }
    public void detach(Observer o){
        list.remove(o);
    }
    protected void notifyObservers(){
        for (Observer o : list){
            o.update();
        }
    }
}
