package JulianIKornel.day9.zadanie3;


import java.util.HashMap;
import java.util.Map;

public class Dictionary {

    private HashMap<String, String> dictionary = new HashMap<>();

    public Dictionary() {
    }

    public void addWord(String polish, String english) {
        dictionary.putIfAbsent(polish.toLowerCase(), english.toLowerCase());

    }

    public void printDictionary() {
        System.out.println(dictionary);
    }

    public void removeWord(String polish) {
        dictionary.remove(polish.toLowerCase());

    }

    public void removeTranslation(String english) {
        String toRemove = "";
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {                 // zawsze entry map jak szukasz po Value w hash mapie
            if (entry.getValue().equals(english.toLowerCase())) {                       // nie mozesz edytowac jesli hash mapa jest przegladana
                toRemove = (entry.getKey());
            }
        }
        removeWord(toRemove);
    }


    public void replaceWord(String polish, String english) {
        if (dictionary.containsKey(polish.toLowerCase())) {
            dictionary.put(polish.toLowerCase(), english.toLowerCase());
        }
    }
}
