package JulianIKornel.day9.zadanie3;


public class Main {

    public static void main(String[] args) {

        Dictionary polEngDict = new Dictionary();

        polEngDict.addWord("Bakłażan", "Eggplant");
        polEngDict.addWord("Jabłko", "Apple");
        polEngDict.addWord("Pies", "Dog");
        polEngDict.addWord("Kot", "Cat");
        polEngDict.printDictionary();
        System.out.println();

        polEngDict.removeWord("Pies");
        polEngDict.removeTranslation("Cat");
        polEngDict.replaceWord("Jabłko", "Pussy");
        polEngDict.printDictionary();
        System.out.println();


        BetterDictionary bettter = new BetterDictionary();
        bettter.addWord("Kot", "Pussy");
        bettter.addWord("Kot", "Cat");
        bettter.addWord("Pies", "Dog");
        bettter.printDictionary();
    }
}