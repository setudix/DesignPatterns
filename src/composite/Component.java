package composite;

import java.util.ArrayList;

public abstract class Component {

    //Operation method
    protected abstract void draw();
    //add
    protected abstract void add(Component component);
    //remove
    protected abstract void remove(Component component);
    protected abstract Component getChild(int x);


}
