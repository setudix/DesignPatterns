package observer;

public class Main {
    public static void main(String[] args) {

        Post post = new Post();
        PostObserver postObserver = new PostObserver(post);
        post.attach(postObserver);

        post.setState("AAAAAAAAAAAAAAAAAAAAAAAAAAAA");

        post.detach(postObserver);
        post.setState("BBBBBBBBBBBBBBBBBBBBBBBB");

        Like like = new Like();
        LikeObserver likeObserver = new LikeObserver(like);
        like.attach(likeObserver);

        like.setValue();
        like.setValue();
        like.setValue();


    }
}
