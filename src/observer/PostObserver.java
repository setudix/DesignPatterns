package observer;

public class PostObserver implements Observer{
    private Post post;
    PostObserver(Post post){
        this.post = post;
    }
    @Override
    public void update() {
        System.out.println("Your friend posted an update: ");
        String content = post.getState();
        int size = Math.min(10, content.length());
        for (int i=0;i<size;i++) {
            System.out.print(content.charAt(i));
        }
        System.out.print("...\n");
    }
}
