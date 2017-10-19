package JulianIKornel.day7.calculator;


public class Main {


    public static void main(String[] args) {
        Calculator bla = new Calculator();
        bla.eval(10f, Operator.fromChar('%'), 4f);

        Operator.fromChar('%').printSign();

        //tworzenie obiektu klasy power
        Operation o1 = new Operation.Power();
        System.out.println(o1.eval(5, 2));
    }
}
