package Alghoritms;

public class SumowanieLiczbNaturalnych extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "Sumowanie liczb naturalnych";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int n = Integer.parseInt(input[1]);
        int suma = 0;
        int i =1;

        while (i<=n){
                suma += i;
            System.out.printf("Iteracja: %d ::: Wartość sumy: %d \n", i, suma);
            i++;

        }
    }
}
