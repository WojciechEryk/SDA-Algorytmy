package Alghoritms;


public class Lider extends AbstractAlgorithm{
    @Override
    public String getName() {
        return " Lider";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int wejscie[] = {1, 2, 2, 2, 6, 1, 2};
        int[] licznik = new int[wejscie.length];
        int min = licznik[0];
        int max = licznik[0];

        for (int i = 0; i < wejscie.length; i++) {
            for (int j = 0; j < wejscie.length; j++) {
                if (wejscie[i] == wejscie[j]) {
                    licznik[i]++;
                }
            }
        }
        for (int cos:licznik) {
            System.out.println(cos);
        }

    }}
