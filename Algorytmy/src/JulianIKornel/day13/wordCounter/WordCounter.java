package JulianIKornel.day13.wordCounter;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCounter {

    public static String readFile(String name) throws IOException {
        Scanner input = null;
        String content = "";
        try {
            Path path = Paths.get(name);
            input = new Scanner(path);

            long start = System.currentTimeMillis();

            while (input.hasNextLine()) {
                content = content + input.nextLine();
            }
            long stop = System.currentTimeMillis();
            System.out.println("Reading file " + (stop - start));
        } finally {
            if (input != null) {
                input.close();
            }

        }
        return content;
    }

    public static TreeMap<String, Integer> countWords(String text) {
        TreeMap<String, Integer> counter = new TreeMap<>();

        String noWhitespace = text.trim();
        String noSpecialChars = noWhitespace.replaceAll("[\\n.,/():;_\\-+!?\\\\\"]", " ");
        String noDoubleSpaces = noSpecialChars.replaceAll("\\s+", " ");
        String lowerCase = noDoubleSpaces.toLowerCase();
        String[] words = lowerCase.split(" ");

        for (String word : words) {
            if (counter.containsKey(word)) {
                int occurrences = counter.get(word);
                counter.put(word, occurrences + 1);
            } else {
                counter.put(word, 1);
            }
        }

        return counter;
    }

    private static void writenMapToFile(TreeMap<String, Integer> map, String name) throws IOException {
        PrintWriter output = null;
        try {
            File file = new File(name);
            if (!file.exists()) {
                file.createNewFile();
            }

            output = new PrintWriter(file);

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                output.printf("The word \"%s occurs %d times\n", entry.getKey(), entry.getValue());
            }

        } finally {
            if (output != null) {
                output.close();
            }
        }
    }

    private static void printSorted(TreeMap<String, Integer> map) {
        map.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(e -> System.out.printf("%s: %d\n", e.getKey(), e.getValue()));


    }

    public static void main(String[] args) {
        String text = null;
        try {
            text = readFile("text.txt");
            TreeMap<String, Integer> wordMap = countWords(text);
            writenMapToFile(wordMap, "dict.txt");
            printSorted(wordMap);
        } catch (IOException e) {
            System.out.println("File handling error");
        }

    }

}
