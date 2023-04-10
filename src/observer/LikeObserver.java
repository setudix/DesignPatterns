package observer;

public class LikeObserver implements Observer{
    private Like like;

    LikeObserver(Like like){
        this.like = like;
    }
    @Override
    public void update() {
        boolean val = like.getValue();
        if (val == true){
            System.out.println("Someone liked your post");
        }
    }
}
