package Alghoritms;


public class Lider extends AbstractAlgorithm {
    @Override
    public String getName() {
        return " Lider";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int wejscie[] = new int[input.length - 1];
        int[] licznik = new int[wejscie.length];
        int max = licznik[0];
        int lider = 0;                                      //To przechowuje pozycje największego licznika ;).
        for (int i = 1; i < input.length; i++) {
            wejscie[i - 1] = Integer.parseInt(input[i]);
        }


        for (int i = 0; i < wejscie.length; i++) {
            for (int j = 0; j < wejscie.length; j++) {
                if (wejscie[i] == wejscie[j]) {
                    licznik[i]++;
                }
                if (max < licznik[i])
                    max = licznik[i];
                lider = i;
            }
        }

//        System.out.println(max);

        if (max>wejscie.length/2){
            System.out.printf("To jest lider: " + input[lider]);
        }else{
            System.out.printf("Tu nie ma lidera :(.");
        }

        }

//            for (Integer cos : wejscie) {
//                System.out.printf(cos + ", ");
//            }
//
//            System.out.println();
//
//            for (Integer cos : licznik) {
//                System.out.printf(cos + ", ");
//            }

        }

