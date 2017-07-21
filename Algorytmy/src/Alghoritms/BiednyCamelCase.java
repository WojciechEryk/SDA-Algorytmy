package Alghoritms;


public class BiednyCamelCase extends AbstractAlgorithm{

    @Override
    public String getName() {
        return "BiednyCamelCase";
    }

    @Override
    public void runAlgorithm(String[] input) {
        System.out.println("Algorytm Biedny Camel Case");

        int literki = 1;

        for (int i=1; i<input.length; i ++) {
            String word = input[i];
            char[] Tablica = word.toCharArray();
            for (int j = 0; j <Tablica.length; j++) {
                if (literki % 2 == 0) {
                    Tablica[j] = Character.toLowerCase(Tablica[j]);

                } else
                    Tablica[j] = Character.toUpperCase(Tablica[j]);

                System.out.print(Tablica[j]);
                literki++;
            }
            System.out.print(" ");
            }

        }
    }


