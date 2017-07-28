package JulianIKornel.day3;


public class Zadanie3 {

    private int n;
    private char[] tab = {'a', 'b', 'r', 'a', 'k', 'a', 'd', 'a', 'b', 'r', 'a'};


    public Zadanie3(int n) {
        this.n = n;
    }

    public void print() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; (j < i + 1) && (j < tab.length); j++) {
                System.out.print(tab[j] + " ");     //print bez ln dzieki temu w tej samej lnie a nie nastepnej
            }
            System.out.println();
        }
    }


    @Override
    public String toString() {
        return "Zadanie3{}";
    }

    public static void main(String[] args) {
        Zadanie3 z3 = new Zadanie3(11);
        System.out.println(z3);

        z3.print();     //Wywolanie metody print do rysowanie 4 gwiazdek
    }
}

