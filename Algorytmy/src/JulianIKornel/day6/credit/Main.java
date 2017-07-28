package JulianIKornel.day6.credit;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Credit creditBankX = new CreditBankX();
        System.out.println(String.format("%3.2f", creditBankX.calculate(1000, 6)));
        System.out.println(String.format("%3.2f", creditBankX.calculate(20000, 48)));
        System.out.println(String.format("%3.2f", creditBankX.calculate(88000, 32)));
        System.out.println(String.format("%3.2f", creditBankX.calculate(75000, 24)));
        System.out.println();

        Credit creditBankY = new CreditBankY();
        System.out.println(String.format("%3.2f", creditBankY.calculate(1000000, 100)));
        System.out.println(String.format("%3.2f", creditBankY.calculate(2500000, 100)));
        System.out.println(String.format("%3.2f", creditBankY.calculate(5000000, 100)));
        System.out.println();

        List<Credit> list = new ArrayList<>();             //lista kredytow i sprawdzenie roznych zmiennych do konkretnych bankow
        list.add(creditBankX);
        list.add(creditBankY);
        for (Credit credit : list) {
            System.out.println(credit.getClass().getSimpleName() + ":");
            System.out.println(String.format("%3.2f", credit.calculate(1000, 6)));
            System.out.println(String.format("%3.2f", credit.calculate(20000, 48)));
            System.out.println(String.format("%3.2f", credit.calculate(88000, 32)));
            System.out.println(String.format("%3.2f", credit.calculate(75000, 24)));
            System.out.println();
        }
    }
}
