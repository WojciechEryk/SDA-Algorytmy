package Alghoritms;


public class ProsteTablice extends AbstractAlgorithm {
    @Override
    public String getName() {
        return " Proste Tablice";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int n = input.length-2;
        int max = Integer.parseInt(input[1])+1;
        int [] tab = new int [n];

        for (int i = 0; i < n ; i++) {
            tab[i] = Integer.parseInt(input[i+2]);
        }


        int [] tablicaDoZliczania = new int [max];

        for (int i = 0; i <tab.length ; i++) {
            int liczba = tab[i];
            tablicaDoZliczania[liczba]++;
        }

        for (int indeksTablicy = 0; indeksTablicy < tablicaDoZliczania.length; indeksTablicy++) {
            for (int ileLiczb = tablicaDoZliczania[indeksTablicy]; ileLiczb >0 ; ileLiczb--) {
                System.out.printf("%d ", indeksTablicy);
            }
        }
    }
}
