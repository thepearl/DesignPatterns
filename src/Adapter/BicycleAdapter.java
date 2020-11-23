package Adapter;

// Notes about Adapter:
/* This design pattern's objective is to run a new feature (Bicycle class)
* into an already developed system (in this case our Rider, Vehicle, Car classes)
* This new feature shouldn't change our existing code. That's why we create this
* BicycleAdapter in order to ADAPT it to our existing code.
*/

public class BicycleAdapter implements Vehicle {

    private Bicycle bicycle;

    public BicycleAdapter(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void accelerate() {
        bicycle.pedale();
    }

    @Override
    public void pushBreak() {
        bicycle.stop();
    }

    @Override
    public void soundHorn() {
        bicycle.ringBell();
    }
}
