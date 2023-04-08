public class Bike implements Vehicle{

    private final int wheel;

    public Bike(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public int getWheel() {
        return wheel;
    }

    @Override
    public String toString() {
        return "Bike that has " + wheel + " wheels";
    }
}
