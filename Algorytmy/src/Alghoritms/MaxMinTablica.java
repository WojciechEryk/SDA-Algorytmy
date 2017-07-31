package Alghoritms;


public class MaxMinTablica extends AbstractAlgorithm {
    @Override
    public String getName() {
        return " Max i Min w Tablicy";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int wejscie [] = {1, 4 ,78, 3};
        int max = wejscie[0];
        int min = wejscie[0];


        for (int i = 0; i <wejscie.length; i++) {
            if(min > wejscie[i]){
                min = wejscie[i];
            }if(max < wejscie[i]){
                max = wejscie[i];
            }
        }
        System.out.println("Wartosc Minimum: " +min);
        System.out.println("Wartosc Maximum: " +max);


        for (int i = 0; i < wejscie.length; i++) {
            if (max==wejscie[i]){
                System.out.println("MAXIMUM = " + i);
            }if (min==wejscie[i]){
                System.out.println("MINIMUN = " + i);
            }
        }


    }
}
