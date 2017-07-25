package Alghoritms;


public class Silnia extends AbstractAlgorithm {
    @Override
    public String getName() {
        return " Silnia";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = Integer.parseInt(input[1]);
        System.out.println(silnia(n));
    }
     private int silnia(int n){
        if(n<2)
            return 1;
        return n*silnia(n-1);
    }
}
