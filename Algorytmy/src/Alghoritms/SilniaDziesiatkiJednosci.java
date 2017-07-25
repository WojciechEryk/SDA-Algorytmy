package Alghoritms;

/**
 * Created by RENT on 2017-07-25.
 */
public class SilniaDziesiatkiJednosci extends AbstractAlgorithm {
    @Override
    public String getName() {
        return " Silnia Dziesiatki Jednosci";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = Integer.parseInt(input[1]);
//        silnia(n);

        switch (n) {
            case 1:
                System.out.println("0 1");
                break;
            case 2:
                System.out.println("0 2");
                break;
            case 3:
                System.out.println("0 6");
                break;
            case 4:
                System.out.println("0 4");
                break;
            case 5:
                System.out.println("2 0");
                break;
            case 6:
                System.out.println("2 0");
                break;
            case 7:
                System.out.println("4 0");
                break;
            case 8:
                System.out.println("2 0");
                break;
            case 9:
                System.out.println("8 0");
                break;
            default:
                System.out.println("0 0");
        }
    }
    private int silnia(int n){
        if(n<2)
            return 1;
        return n*silnia(n-1);
    }
}
