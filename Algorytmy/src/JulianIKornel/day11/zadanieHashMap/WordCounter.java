package JulianIKornel.day11.zadanieHashMap;

import java.util.Arrays;
import java.util.TreeMap;

public class WordCounter {

    public static TreeMap<String, Integer> countWords(String text) {
        TreeMap<String, Integer> counter = new TreeMap<>();

        String nowhitespace = text.trim();
        String noSpecialChars = nowhitespace.replaceAll("[.,/()?!;:\\-_\\\\+]", " ");
        String noDoubleSpaces = noSpecialChars.replaceAll("\\s+", " ");
        String lowerCase = noDoubleSpaces.toLowerCase();


        System.out.println(nowhitespace);
        System.out.println("- - - - - - - - - -");

        String[] words = lowerCase.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println("- - - - - - - - - -");


        for (String word : words) {
            if (counter.containsKey(word)) {
                int occurences = counter.get(word);
                counter.put(word, occurences + 1);
            } else {
                counter.put(word, 1);
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        printSorted(countWords("  Muzo! Męża wyśpiewaj,      co święty gród Troi\n" +
                "Zburzywszy, długo błądził i\\w tułaczce-swojej\n" +
                "Siła różnych_miast widział, poznał tylu ludów\n" +
                "Zwyczaje, a co przygód doświadczył i trudów!\n" +
                "\n" +
                "A co strapień na morzach, gdy przyszło za siebie\n" +
                "Lub za swe towarzysze stawić się w potrzebie,\n" +
                "By im powrót zapewnić! Nad siły on robił,\n" +
                "Lecz druhów nie ocalił: każdy z nich się dobił\n" +
                "Sam, głupstwem+własnym. Czemuż poświęcone stada\n"));
    }

    private static void printSorted(TreeMap<String, Integer> map) {

    }
}
