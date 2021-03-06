package JulianIKornel.day6.geometry;


public class Parallelogram extends Trapeze {

    private double b;

    public Parallelogram(double a, double b, double h) {
        super(a, a, h);
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * h;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public String toString() {
        return "Parallelogram{" + "a=" + a + ", b=" + b + ", h=" + h + '}';
    }
}
