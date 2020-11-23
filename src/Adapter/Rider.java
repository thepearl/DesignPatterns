package Adapter;

// Client
public class Rider {

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bicycle = new BicycleAdapter(new Bicycle());

        playWithVehicle(car);
        playWithVehicle(bicycle);
    }

    private static void playWithVehicle(Vehicle car) {
        car.accelerate();
        car.pushBreak();
        car.soundHorn();
    }
}
