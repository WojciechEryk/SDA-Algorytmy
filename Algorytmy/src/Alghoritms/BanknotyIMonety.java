package Alghoritms;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by RENT on 2017-07-24.
 */
public class BanknotyIMonety extends AbstractAlgorithm{
    @Override
    public String getName() {
        return " Banknoty i monety";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int [] zlotowki = {200, 100, 50, 20, 10, 5, 2, 1};
        int [] grosze = {50, 20, 10, 5, 2, 1};


        int kwota = 0;
        int iloscZlotowek = 0;
        kwota = Integer.parseInt(input[1]);
        System.out.println("Nominaly w zlotówkac: ");

        for (int banknoty:zlotowki) {
            iloscZlotowek = kwota / banknoty;
            kwota = kwota - banknoty*iloscZlotowek;
            System.out.println(banknoty + " x " + iloscZlotowek);
        }

        System.out.println("----------------------");

        int kwotaGrosze = 0;
        kwotaGrosze = Integer.parseInt(input[2]);
        int iloscGroszy = 0;

        System.out.println("Nominaly w groszach: ");

        for (int grosiki:grosze) {
            iloscGroszy = kwotaGrosze / grosiki;
            kwotaGrosze = kwotaGrosze - grosiki*iloscGroszy;
            System.out.println(grosiki + " x " + iloscGroszy);

        }

    }
}
