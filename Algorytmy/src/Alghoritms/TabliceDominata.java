package Alghoritms;


public class TabliceDominata extends AbstractAlgorithm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgorithm(String[] input) {

        int [] zawartosc = new int [input.length -1];
        int [] cyfry = new int [zawartosc.length];


        for (int i = 0; i < input.length-1; i++) {
            zawartosc[i] = Integer.parseInt(input[i+1]);
        }


    }
}
