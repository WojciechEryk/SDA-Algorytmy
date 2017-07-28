package Alghoritms;


public class Warcaby extends AbstractAlgorithm {
    @Override
    public String getName() {
        return " Warcaby";
    }


    @Override
    public void runAlgorithm(String[] input) {


        int dlugosc = Integer.parseInt(input[1]);
        int szerokosc = Integer.parseInt(input[2]);

        char [][] tablica = new char[dlugosc][szerokosc];
        char [] kolor = new char [2];

        String pierwszykolor = input[3];
        char pierwszy = pierwszykolor.charAt(0);
        kolor [1] = pierwszy;

        if (kolor[1]=='B') {
            kolor[0] = 'C';
        }else{kolor[0] ='B';}



        for (int i = 0; i < dlugosc; i = i + 2) {
            for (int j = 1; j < szerokosc; j = j + 2) {
                tablica[i][j] = kolor [0];
            }
            for (int j = 0; j < szerokosc; j = j + 2) {
                tablica[i][j] = kolor [1];
            }

        }
        for (int i = 1; i < dlugosc; i = i + 2) {
            for (int j = 1; j < szerokosc; j = j + 2) {
                tablica[i][j] = kolor [1];
            }
            for (int j = 0; j < szerokosc; j = j + 2) {
                tablica[i][j] = kolor [0];
            }

        }
        for (int i = 0; i < dlugosc; i++) {
            for (int j = 0; j < szerokosc; j++) {
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }


    }

}

