package JulianIKornel.day9;


public class SkroconyIF {
    public static void main(String[] args) {
        printPositive(6);
        printPositive(-6);
        printPositive(2);
    }

    public static void printPositive(int i) {
//        if (i > 0) {
//            System.out.println(i);
//        } else {
//            System.out.println(0);
//        }
        int x = (i > 0) ? i : 0;
        System.out.println((i > 0) ? i : 0);                     // to to samo co if'f wyzej
    }
}
