package Alghoritms;


public class Fibonacci extends AbstractAlgorithm {
    @Override
    public String getName() {
        return " Fibonacci";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = Integer.parseInt(input[1]);
        int a = 0;
        System.out.println(fib(n));
    }

    private int fib(int n) {
        if (n <= 2)
            return 1;
        return fib(n-1)+fib(n-2);
    }
}
