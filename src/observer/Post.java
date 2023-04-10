package observer;

public class Post extends EventType{
    private String post;

    public void setState(String post){
        this.post = post;
        notifyObservers();
    }
    public String getState(){
        return post;
    }
}