package JulianIKornel.day7.calculator;


public enum Operator {                           //Mamy zbior elementow wykorzystanych w kalkulatorze, mniej pisania i latwiejsze uzycie, mniejsze ryzyko bledu
    ADD('+', new Operation.Add()),
    SUBS('-', new Operation.Subtract()),
    MULT('*', new Operation.Multiply()),
    DIVE('/', new Operation.Divide()),
    MOD('%', new Operation.Modulo()),
    POW('^', new Operation.Power()),
    NONE(' ', new Operation.None()
    );

    private char sign;
    private Operation operation;

    Operator(char sign, Operation operation) {
        this.sign = sign;
        this.operation = operation;
    }

    public void printSign() {
        System.out.print(", " + sign);
    }

    public double eval(double a, double b) {
        return operation.eval(a, b);
    }


    public static Operator fromChar(char c) {
        switch (c) {
            case '+':
                return ADD;
            case '-':
                return SUBS;
            case '*':
                return MULT;
            case '/':
                return DIVE;
            case '%':
                return MOD;
            case '^':
                return POW;
            default:
                return NONE;
        }
    }
}
