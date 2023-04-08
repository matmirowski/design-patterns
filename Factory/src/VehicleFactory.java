public abstract class VehicleFactory {
    public static Vehicle getInstance(String type, int wheel) {
        if (type.equals("car"))
            return new Car(4);
        else if (type.equals("bike"))
            return new Bike(2);
        return null;
    }
}
