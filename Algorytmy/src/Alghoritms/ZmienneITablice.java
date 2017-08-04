package Alghoritms;


public class ZmienneITablice extends AbstractAlgorithm {
    @Override
    public String getName() {
        return " Zmienne i Tablice";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int [] tablica = new int [input.length-1];
        System.out.printf("{ ");
        for (int i = 0; i < tablica.length ; i++) {

            tablica[i] = Integer.parseInt(input[i+1]);
            System.out.print( +tablica[i] + ", ");
        }
        System.out.printf("}");
        System.out.println();

        for (int i = 0; i <tablica.length; i++) {
            for (int j = 0; j < tablica.length  ; j++) {
                if ((tablica[i]==tablica[j]) && (j!=i)){
                    System.out.println("POZYCJA PIERWSZA = " + i);
                    System.out.println("POZYCJA DRUGA = " + j);
                    return;
                }
            }if (i==tablica.length-1){
                System.out.println("Nie ma powtórzeń :(");
            }
        }
    }
}