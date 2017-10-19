package JulianIKornel.day7.vehicle;


public class Bicycle extends Vehicle {

    public Bicycle() {
        super(2);
    }

    @Override
    public void ride() {
        System.out.println("i ride bicycle");

    }

    @Override
    public void brake() {
        System.out.println("i brake my bicycle");

    }
}
