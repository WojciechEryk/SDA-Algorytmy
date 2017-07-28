package JulianIKornel.day3;


public class Main {

    public static void main(String[] args) {
        Temperature t1 = Temperature.fromCelcius(27); // mozna zrobic bez "new" bo konstrukor jest prywatny i nie mozna go uzywac

        Temperature t2 = Temperature.fromFahreinheit(103); //bez "new" dopiero new jest na koncu metody, lepsza metoda

        Temperature t3 = Temperature.fromKelvin(307); // To samo co wyzej ze zmienionymi nazwami


        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
        System.out.println();

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println();

        System.out.println(t1 + " " + t1.toKelvin());
        System.out.println(t2 + " " + t2.toKelvin());
        System.out.println(t3 + " " + t3.toKelvin());
        System.out.println();

        System.out.println(t1 + " " + t1.toCelcius());
        System.out.println(t2 + " " + t2.toCelcius());
        System.out.println(t3 + " " + t3.toCelcius());
        System.out.println();


    }
}