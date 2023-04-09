public class Main {
    public static void main(String[] args) {
        Blog blog = new Blog();
        Reader reader = new Reader(blog);

        blog.addReader(reader);
        blog.publishArticle("New article");

    }
}