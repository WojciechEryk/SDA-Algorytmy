package JulianIKornel.day16;


public class Zad1Zprezentacji {
    public static void main(String[] args) {
        String longer = betterString("Ala", "Kotek", (s1, s2) -> s1.length() > s2.length());
        String hasCat = betterString("Kotek", "Piesek", ((s1, s2) -> s1.contains("Kotek")));
        System.out.println("Longer " + longer);
        System.out.println("Has Cat " + hasCat);
    }

    interface Better {
        boolean isBetter(String s1, String s2);
    }

    private static String betterString(String s1, String s2, Better better) {
        return (better.isBetter(s1, s2)) ? s1 : s2;

    }

}