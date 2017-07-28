package JulianIKornel.day11.zad3;

/**
 * Created by RENT on 2017-07-11.
 */
public class Main {

    public static void main(String[] args) {
        GuitarFactory fender = new GuitarFactory("Feder");
        GuitarFactory gibson = new GuitarFactory("Gibson");

        fender.makeGuitar("Stratocaster", 8000);
        gibson.makeGuitar("Les Paul", 6000);
        fender.makeGuitar("Telecaster", 4000);
        gibson.makeGuitar("Firebird", 3000);

        for (Guitar guitar : fender.guitarlist) {
            System.out.println(guitar.getModel() + " " + guitar.getSerialNumber());
            guitar.play();
        }
        System.out.println("- - - - - - - - - - - - - - -");
        for (Guitar guitar : gibson.guitarlist) {
            System.out.println(guitar.getModel() + " " + guitar.getSerialNumber());
        }
        gibson.testGuitars();


    }
}
