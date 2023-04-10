package observerAssignment;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("textfile");
        ConcreteFileSubject concreteFileSubject = new ConcreteFileSubject();

        Observer ob1 = new FileObserver(1);
        concreteFileSubject.register(ob1);

        Observer ob2 = new FileObserver(2);
        concreteFileSubject.register(ob2);

        concreteFileSubject.setFile(file);

        concreteFileSubject.unregister(ob2);

    }
}
