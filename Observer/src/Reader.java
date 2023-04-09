public class Reader implements Observer {

    private Blog blog;
    private String article;

    public Reader(Blog blog) {
        this.blog = blog;
        article = blog.getArticle();
    }

    @Override
    public void update() {
        article = blog.getArticle();
        System.out.println("Info " + article);
    }
}
