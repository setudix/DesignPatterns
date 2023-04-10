package observer;

public class Like extends EventType{
    private boolean value = false;

    public void setValue(){
        if (value == true)
            value = false;
        else
            value = true;
        notifyObservers();
    }
    public boolean getValue(){
        return value;
    }
}
