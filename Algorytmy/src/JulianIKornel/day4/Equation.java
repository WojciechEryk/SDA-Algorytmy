package JulianIKornel.day4;


public class Equation {

    private double a;
    private double b;
    private double c;

    private double delta;
    private double x1;
    private double x2;
    // -1 nieskoczenie wiele
    // 0,1,2 rozwiazanie

    private int numOfSols;

    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public void solve() {
        if (a == 0) {
            solveLinear();
        } else {
            solveQuadratic();
        }
    }

    private void solveLinear() {
        if (b == 0) {
            if (c == 0) {
                numOfSols = -1;
            } else {
                numOfSols = 0;
            }
        } else {
            numOfSols = 1;
            x1 = -c / b;
        }
    }

    private void solveQuadratic() {
        countDelta();
        countSoulution();

        switch (numOfSols) {
            case 2:
                double sqrtDelta = Math.sqrt(delta);
                x1 = (-b - sqrtDelta) / (2 * a);
                x2 = (-b + sqrtDelta) / (2 * a);
                break;
            case 1:
                x1 = -b / (2 * a);
                break;
            case 0:
            default:  //do nothing

        }
    }

    private void countDelta() {
        delta = b * b - 4 * a * c;
    }

    private void countSoulution() {
        if (delta > 0) {
            numOfSols = 2;
        } else if (delta == 0)
            numOfSols = 1;
        else {
            numOfSols = 0;
        }
    }

    public double getA() {
        return a;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public int getNumOfSols() {
        return numOfSols;
    }

    @Override
    public String toString() {
        return ("a = " + a + " " +
                "b = " + b + " " +
                "c = " + c + "       ->      " +
                "ax^2 + bx + c = 0    ->    " + "x1 = " + x1 + ", " + "x2 = " + x2).replaceAll("\\+ -", "-");
    }

    public static void main(String[] args) {
        Equation eq1 = new Equation(1, -2, 1);  // x^2 - 2x +1 = (x-1)^2
        Equation eq2 = new Equation(1, -1, 0);  // x^2 - x = x(x-1)
        Equation eq3 = new Equation(3, -1, -2);   // 3x^2 -x -2

        eq1.solve();
        eq2.solve();
        eq3.solve();

        System.out.println(eq1.getNumOfSols());
        System.out.println(eq2.getNumOfSols());
        System.out.println(eq3.getNumOfSols());

        System.out.println();

        System.out.println(eq1.toString());
        System.out.println(eq2.toString());
        System.out.println(eq3.toString());

    }

}

