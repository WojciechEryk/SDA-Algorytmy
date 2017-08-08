import java.util.Scanner;
public class Uzytkownik{

    public void dodawanie(){

        int a = 0;
        int b = 0;
        Scanner odczyt = new Scanner(System.in);
        a = odczyt.nextInt();
        b = odczyt.nextInt();

        System.out.println();
        System.out.print(a + b);
    }
}