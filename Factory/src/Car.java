public class Car implements Vehicle{
    private final int wheel;

    public Car(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public int getWheel() {
        return wheel;
    }

    @Override
    public String toString() {
        return "Car that has " + wheel + " wheels";
    }
}
