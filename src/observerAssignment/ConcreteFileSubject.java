package observerAssignment;

import java.io.File;

public class ConcreteFileSubject extends Subject implements Runnable{
    private File file;

    public void setFile(File file){
        this.file = file;
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        long lastModified = file.lastModified();
        while (true){
            try{
                if (lastModified != file.lastModified()){
                    lastModified = file.lastModified();
                    notifyObservers();
                }
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
