package JulianIKornel.day11.zad3;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-07-11.
 */
public class GuitarFactory {
    String name;
    ArrayList<Guitar> guitarlist = new ArrayList<>();

    public GuitarFactory(String name) {
        this.name = name;
    }

    public Guitar makeGuitar(String model, int price) {
        Guitar guitar = new Guitar(model, price);
        guitarlist.add(guitar);
        return guitar;
    }

    public void testGuitars() {
        for (Guitar guitar : guitarlist) {
            guitar.play();
        }

    }

}
