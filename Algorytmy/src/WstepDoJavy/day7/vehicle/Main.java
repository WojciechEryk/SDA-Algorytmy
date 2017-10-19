package JulianIKornel.day7.vehicle;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Vehicle b1 = new Bicycle();
        Vehicle c1 = new Car();

        System.out.println("\tBike:\n");
        b1.ride();
        b1.brake();
        System.out.println("Wheels: " + b1.getWheels());
        System.out.println();

        System.out.println("\tCar:\n");
        c1.ride();
        c1.brake();
        System.out.println("Wheels: " + c1.getWheels());
        System.out.println();

        System.out.println("\tMotorbike:\n");
        Vehicle mb1 = new Motorbike();
        mb1.ride();
        mb1.brake();
        System.out.println("Wheels: " + mb1.getWheels());
        System.out.println();


        List<Vehicle> list = new ArrayList<>();
        list.add(new Bicycle());
        list.add(new Motorbike());
        list.add(new Car());

        for (Vehicle v : list) {
            System.out.println("\n" + v.getClass().getSimpleName() + ":");
            v.ride();
            v.brake();

        }

    }
}
