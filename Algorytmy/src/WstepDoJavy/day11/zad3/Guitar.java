package JulianIKornel.day11.zad3;

/**
 * Created by RENT on 2017-07-11.
 */
public class Guitar {
    private static int numbersOfGuitars = 0;

    private String model;
    private int price;
    private int serialNumber;


    public Guitar(String model, int price) {
        this.model = model;
        this.price = price;
        serialNumber = ++numbersOfGuitars;
    }

    public void play() {
        System.out.println("Twang");
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
