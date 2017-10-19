package JulianIKornel.day7.calculator;


public class Calculator {


    public Calculator() {
    }

    public double eval(double a, Operator o, double b) {

        return o.eval(a, b);

    }


}
