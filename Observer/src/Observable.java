public interface Observable {
    void addReader(Observer observerReader);
    void deleteReader(Observer observerReader);
    void notifyReaders();
}
