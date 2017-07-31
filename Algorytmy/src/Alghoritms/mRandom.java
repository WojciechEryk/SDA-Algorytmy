package Alghoritms;


import java.util.Random;

public class mRandom extends AbstractAlgorithm {
    @Override
    public String getName() {
        return " mRandom";
    }

    @Override
    public void runAlgorithm(String[] input) {

        Random genarator = new Random();
        int a = 1;
        a =  ((Math.abs(genarator.nextInt())%100+1)*2)-1;       // bez -1 są liczby parzyste, ograniczylem sobie rozmiar tablicy do maksymalnie 100 elementów
        int tablicaLosowych [] = new int [a];

        for (int i = 1; i < tablicaLosowych.length ; i++) {
            tablicaLosowych[i]= ((Math.abs(genarator.nextInt())%100+1)*2)-1;
            System.out.println(i + ". " +tablicaLosowych[i]);
        }

        System.out.println();
        System.out.println("-----------------------");
        System.out.println();

        int parzyste[] = new int [10];
        for (int i = 0, j=0; i < parzyste.length; i++, j=j+2) {
            parzyste[i] = j;
            System.out.println(i + ". " + parzyste[i]);
        }

    }
}
