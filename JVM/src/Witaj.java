public class Witaj{
    /**
     * Program wyswietla hello,
     * liczy do 0 do 9,
     * dodaje 2 liczby podane przez uzytkownika
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Witaj");
        System.out.println("");
        System.out.println("");
        /**
         * powyzej wyswietlamy hello
         * ponizej tworzymy obiekty innych class i wywolujemy ich metody
         */

        Petla p = new Petla ();
        p.petelka();
/**
 * ponizej tworze obiekt klasy Uzytkownik i wywoluje na nim funkcje dodawanie
 */
        Uzytkownik u = new Uzytkownik();
        u.dodawanie();

    }
}
