package JulianIKornel.day4;


public class Palindrome {

    private String text; //Pole
    private String textPrepared;

    public Palindrome(String text) {       //konstruktor
        this.text = text;
        prepareString();

    }

    private void prepareString() {             //usuwanie spacji

        String tmp = "";
        int len = text.length();
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) != ' ') {
                tmp = tmp + text.charAt(i);
            }
        }
        this.textPrepared = tmp.toLowerCase();
    }

    public boolean check() {
        int len = textPrepared.length();
        int len2 = len / 2;

        for (int i = 0; i < len2; i++) {
            if (textPrepared.charAt(i) != textPrepared.charAt((len - i - 1))) {
                return false;
            }
        }
        return true;
    }

    public boolean checkFaster() {             // duzo szybsza metoda
        String trimmed = text.replaceAll(" ", "").toLowerCase();          //metoda zamiany znakow i tworzenie obiektu trimmed
        String reversed = new StringBuilder(trimmed).reverse().toString();  //Sworzenie nowego obiektu String builder oraz obiekt String i metoda recerse
        return trimmed.equals(reversed);
    }


    @Override
    public String toString() {
        return text;
    }

    public static void main(String[] args) {

        Palindrome p1 = new Palindrome("Kajak");         // obiekty typu palindrome
        Palindrome p2 = new Palindrome("kajak");
        Palindrome p3 = new Palindrome("kobyla ma maly bok");
        Palindrome p4 = new Palindrome("kobylamamalybok");

        System.out.println(p1 + " : " + p1.check());
        System.out.println(p2 + " : " + p2.check());
        System.out.println(p3 + " : " + p3.check());
        System.out.println(p4 + " : " + p4.check());

        System.out.println();


        System.out.println(p1 + " : " + p1.checkFaster());
        System.out.println(p2 + " : " + p2.checkFaster());
        System.out.println(p3 + " : " + p3.checkFaster());
        System.out.println(p4 + " : " + p4.checkFaster());


    }
}


