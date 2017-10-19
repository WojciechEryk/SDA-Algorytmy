package JulianIKornel.day5;


public class Calculator {


    public Calculator() {
    }

    public double eval(double a, Operator o, double b) {

        double result = 0;

        switch (o) {

            case ADD:
                result = a + b;
                break;

            case SUBS:
                result = a - b;
                break;

            case MULT:
                result = a * b;
                break;

            case DIVE:
                if (b != 0) {
                    result = a / b;
                } else
                    result = 0;
                break;

            case MOD:
                result = a % b;
                break;

            case POW:
                result = Math.pow(a, b);
                break;
            default:
                result = 0;

        }
        System.out.println(String.format("%.2f", result));
        return result;

    }


    public static void main(String[] args) {
        Calculator bla = new Calculator();
        bla.eval(10f, Operator.fromChar('%'), 4f);

        Operator.fromChar('%').printSign();

    }
}
