package Alghoritms;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-08-01.
 */
public class ZadankoTworzenieListy extends AbstractAlgorithm {
    @Override
    public String getName() {
        return " Zadanko Tworzenie Listy";
    }

    @Override
    public void runAlgorithm(String[] input) {

        String[]kolory = {"niebieski", "czarny", "żółty", "fioletowy"};
        ArrayList <String> kolorki = new ArrayList();
        for (int i = 0; i <kolory.length; i++) {
            kolorki.add(kolory[i]);
        }

        System.out.println(kolorki);

        kolorki.add(0, "rózowy");
        kolorki.add(kolorki.size(), "zielony");

        System.out.println(kolorki);

        for (String s :kolorki) {
            System.out.println(s);
        }


    }
}
