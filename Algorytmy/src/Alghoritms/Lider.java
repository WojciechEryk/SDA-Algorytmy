package Alghoritms;


public class Lider extends AbstractAlgorithm{
    @Override
    public String getName() {
        return " Lider";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int wejscie[] = new int [input.length-1];
        int[] licznik = new int[wejscie.length];
        int min = licznik[0];
        int max = licznik[0];

        for (int i = 1; i < input.length; i++) {
            wejscie[i-1] = Integer.parseInt(input[i]);}


        for (int i = 0; i < wejscie.length ; i++) {
            for (int j = 0; j < wejscie.length; j++) {
                if(wejscie[i]==wejscie[j]){
                    licznik[i]++;
                }
            }
        }

        for (Integer i:wejscie) {
            System.out.printf(i + ", ");}

        System.out.println();

        for (Integer i:licznik) {
            System.out.printf(i + ", ");
        }

    }
}
