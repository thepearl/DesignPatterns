package Adapter;

public class Car implements Vehicle{

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating => ");
    }

    @Override
    public void pushBreak() {
        System.out.println("Car has Stopped !");
    }

    @Override
    public void soundHorn() {
        System.out.println("Beep Beep");
    }
}
