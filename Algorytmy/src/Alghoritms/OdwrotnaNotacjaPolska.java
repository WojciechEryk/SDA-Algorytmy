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

        for (int i = 1; i <input.length; i++) {

            switch (input[i]) {
                case "+":
                a = stosik2.pop();
                b = stosik2.pop();
                    System.out.println("Działanie nr " + i + "." + "A + B = " + a+b);



                default:
                    stosik2.push(Integer.parseInt(input[i]));

            }
        }

    }
}
