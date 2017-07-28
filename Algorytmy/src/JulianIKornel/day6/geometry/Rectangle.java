package JulianIKornel.day6.geometry;


public class Rectangle extends Parallelogram {

    private double b;

    public Rectangle(double a, double b) {
        super(a, b, b);
    }

    @Override
    public String toString() {
        return "Rectangle{a=" + a + ", b=" + h + "}";
    }
}

