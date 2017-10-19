package JulianIKornel.day9.zadanie3;


import java.util.ArrayList;
import java.util.HashMap;

public class BetterDictionary {

    private HashMap<String, ArrayList> dictionary = new HashMap<>();

    public BetterDictionary() {
    }

    public void addWord(String polish, String english) {
        if (dictionary.containsKey(polish)) {
            ArrayList<String> translations = dictionary.get(polish);
            translations.add(english);
        } else {
            ArrayList<String> translations = new ArrayList<>();
            translations.add(english);
            dictionary.put(polish, translations);
        }
//        dictionary.putIfAbsent(polish.toLowerCase(), );

    }

    public void printDictionary() {
        System.out.println(dictionary);
    }

//    public void removeWord(String polish) {
//        dictionary.remove(polish.toLowerCase());
//
//    }
//
//    public void removeTranslation(String english) {
//        String toRemove = "";
//        for (Map.Entry<String, String> entry : dictionary.entrySet()) {                 // zawsze entry map jak szukasz po Value w hash mapie
//            if (entry.getValue().equals(english.toLowerCase())) {                       // nie mozesz edytowac jesli hash mapa jest przegladana
//                toRemove = (entry.getKey());
//            }
//        }
//        removeWord(toRemove);
//    }
//
//
//    public void replaceWord(String polish, String english) {
//        if (dictionary.containsKey(polish.toLowerCase())) {
//            dictionary.put(polish.toLowerCase(), english.toLowerCase());
//}
//    }
}
