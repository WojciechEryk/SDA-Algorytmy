package Alghoritms;

import java.util.Stack;

public class OdwrotnaNotacjaPolska extends AbstractAlgorithm {
    @Override
    public String getName() {
        return " Odwrotna Notacja Polska";
    }

    @Override
    public void runAlgorithm(String[] input) {

        Stack<Integer> stosik2 = new Stack<>();


        int a = 0;
        int b = 0;
        int wynik =0;

        for (int i = 1; i <input.length; i++) {

            switch (input[i]) {
                case "+":
                a = stosik2.pop();
                b = stosik2.pop();
                    wynik = a+b;
                    System.out.println("Działanie dodawanie A + B = " + wynik);
                    stosik2.push(wynik);
                    break;
                case "-":
                a = stosik2.pop();
                b = stosik2.pop();
                    wynik = a-b;
                    System.out.println("Działanie odejmowanie A + B = " + wynik);
                    stosik2.push(wynik);
                    break;
                case "/":
                a = stosik2.pop();
                b = stosik2.pop();
                    wynik = a/b;
                    System.out.println("Działanie dzielenie A + B = " + wynik);
                    stosik2.push(wynik);
                    break;
                case "m":
                a = stosik2.pop();
                b = stosik2.pop();
                    wynik = a*b;
                    System.out.println("Działanie mnozenie A + B = " + wynik);
                    stosik2.push(wynik);
                    break;

                case "=":
                    System.out.println();
                    System.out.println("---------------------------------------");
                    System.out.println();
                    System.out.println("Nasz ostateczny wynik to: " +stosik2.pop());
                    break;


                default:
                    stosik2.push(Integer.parseInt(input[i]));

            }
        }

    }
}
