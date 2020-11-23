package Singleton;

public class Printer {

    public static void main(String[] args) {
        Singleton printer1 = Singleton.getInstance();
        Singleton printer2 = Singleton.getInstance();

        System.out.println(printer1.hashCode());
        System.out.println(printer2.hashCode());

        printer1.printData();
        printer2.printData();
    }
}
