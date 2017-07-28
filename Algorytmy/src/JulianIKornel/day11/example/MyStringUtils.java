package JulianIKornel.day11.example;

public class MyStringUtils {

    public static boolean isLowerCase(String s1) {
        return s1.equals(s1.toLowerCase());
    }

    public static void main(String[] args) {
        String s = "HelloWorld!";
        String s2 = "helloworld!";
        System.out.println(isLowerCase(s));
        System.out.println(isLowerCase(s2));
    }
}