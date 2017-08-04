package Alghoritms;


import JulianIKornel.day5.Array;

import java.util.ArrayList;
import java.util.Stack;

public class StosArrayList extends AbstractAlgorithm {
    @Override
    public String getName() {
        return " Stos i ArrayList";
    }

    @Override
    public void runAlgorithm(String[] input) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < input.length; i++) {
            list.add(Integer.parseInt(input[i]));
        }
        System.out.printf("Nasze liczby: { ");
        for (Integer i :list) {
            System.out.print(i + ", ");
        }System.out.printf("}" +"\n");

        Stack<Integer>stosik = new Stack<>();
        for (Integer wartosci :list) {
            stosik.push(wartosci);
        }System.out.println();


        for (int i = 0; i <1 ; i++) {
            for (int j = 0; j < stosik.size(); j++) {
                if (stosik.pop() == list.get(j)) {
                } else {
                    System.out.println("To nie jes palindrome.");
                    return;
                }
            }

            System.out.println("To Palidrome");
        }
        }

    }

