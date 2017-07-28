package JulianIKornel.day5;


import java.util.ArrayList;
import java.util.List;

public class Numbers {
    private int n;

    public Numbers(int n) {
        this.n = n;
    }

    public void printNumbers() {
        List<Integer> list = new ArrayList<>();   //tworzymy liste intigerow o nazwie list do przchowana wynikow

        for (int i = 1; i <= n; i++) {
            if ((i % 2 == 0) || (i % 7 == 0)) {
                list.add(i);                      //dodawanie elementow do listy

            }

        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        Numbers n1 = new Numbers(10);
        n1.printNumbers();
    }

}
