package Alghoritms;


public class NajmniejszaWspolnaWielokrotnosc extends AbstractAlgorithm {
    @Override
    public String getName() {
        return " Najmniejsza Wspolna Wielokrotnosc";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int a = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);
        int wynik = 0;

        wynik = (a*b)/rekurencja(a,b);
        System.out.println(wynik);

    }
    private int rekurencja(int a, int b) {
        if (b == 0) {
            return a;
        }else
            return rekurencja(b, a%b);
    }
}
