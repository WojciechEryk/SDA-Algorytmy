package Alghoritms;

public class Statki extends AbstractAlgorithm {
    @Override
    public String getName() {
        return " Statki";
    }

    @Override
    public void runAlgorithm(String[] input) {

    int rozmiar = Integer.parseInt(input[1]);
    String [] literki = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};


        if (Math.sqrt(rozmiar)%1==0) {
            System.out.println("Ta liczba jes OK!");
            System.out.println("--------------------------------");

            for (int i = 0; i < rozmiar ; i++) {
                for (int j = 1; j < rozmiar+1; j++) {
                    System.out.print(literki[i]+j + " ");
                }
                System.out.println();

            }

        }else System.out.println("Ta liczba nie pierwiastkuje do pola gry w statki");

        }
    }

