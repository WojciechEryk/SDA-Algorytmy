package Alghoritms;


public class RekurencjaSuma extends AbstractAlgorithm {
    @Override
    public String getName() {
        return " Rekurencja suma";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = Integer.parseInt(input[1]);
        System.out.println(suma(n));
    }

    private int suma(int n) {
        if (n<2)
            return 1;
        return n + suma(n-1);
    }
}
