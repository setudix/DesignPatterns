package composite;

import java.util.ArrayList;

public class Picture extends Component{
    private ArrayList<Component> list = new ArrayList<>();
    @Override
    protected void draw() {
        for (Component g : list){
            g.draw();
        }
    }

    @Override
    protected void add(Component component) {
        list.add(component);
    }

    @Override
    protected void remove(Component component) {
        list.remove(component);
    }

    @Override
    protected Component getChild(int x) {
        return list.get(x);
    }
}
