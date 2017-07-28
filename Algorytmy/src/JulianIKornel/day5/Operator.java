package JulianIKornel.day5;


public enum Operator {                           //Mamy zbior elementow wykorzystanych w kalkulatorze, mniej pisania i latwiejsze uzycie, mniejsze ryzyko bledu
    ADD('+'), SUBS('-'), MULT('*'), DIVE('/'), MOD('%'), POW('^'), NONE(' ');

    private char sign;

    Operator(char sign) {
        this.sign = sign;
    }

    public void printSign() {
        System.out.print(", " + sign);
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
