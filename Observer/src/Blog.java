import java.util.HashSet;
import java.util.Set;

public class Blog implements Observable {

    Set<Observer> readers = new HashSet<>();
    private String article;

    @Override
    public void addReader(Observer observerReader) {
        readers.add(observerReader);
    }

    @Override
    public void deleteReader(Observer observerReader) {
        readers.remove(observerReader);
    }

    @Override
    public void notifyReaders() {
        readers.forEach(Observer::update);
    }

    public void publishArticle(String article) {
        this.article = article;
        notifyReaders();
    }

    public String getArticle() {
        return article;
    }
}
