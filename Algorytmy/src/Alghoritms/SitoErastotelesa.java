package Alghoritms;


public class SitoErastotelesa extends  AbstractAlgorithm {

    int n;
    boolean [] tablica;

    @Override
    public String getName() {
        return " Sito Erastotelesa";
    }


    public SitoErastotelesa() {
        this.n = 10000;
        this.tablica = new boolean [10000];

    }

    public SitoErastotelesa(int n) {
        this.n = n;
        this.tablica = new boolean[n];

    }

    @Override
    public void runAlgorithm(String[] input) {
        tablica = new boolean[Integer.parseInt(input[1])];

        for (int i = 2; i < tablica.length; i++) {
            if (tablica[i]==false){
                System.out.println(i);
                for (int j = i+i; j <tablica.length; j=j+i) {
                    tablica[j] = true;
                }
            }
        }
    }
}
