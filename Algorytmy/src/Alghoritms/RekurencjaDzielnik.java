package Alghoritms;


public class RekurencjaDzielnik extends AbstractAlgorithm {
    @Override
    public String getName() {
        return " Rekurencja Dzielnik";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int a = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);
//        System.out.println(dzielnik(a,b));
        System.out.println(rekurencja(a,b));
    }

    //    private int dzielnik(int a, int b) {
//        int c = 0;
//
//        while (b != 0) {
//            c = a % b;
//            a = b;
//            b = c;
//        }
//        return a;
//
//    }

    private int rekurencja(int a, int b) {
        if (b == 0) {
            return a;
        }else
        return rekurencja(b, a%b);
    }
}