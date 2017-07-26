package Alghoritms;


public class SortowanieBabelkowe extends AbstractAlgorithm {
    @Override
    public String getName() {
        return " Sortowanie bąbelkowe";
    }

    @Override
    public void runAlgorithm(String[] input) {


        int temp = 0;
        int table [] = new int [input.length-1];
        for (int i = 0; i < table.length; i++) {
            table[i] = Integer.parseInt(input[i+1]);
        }
        for (int j = 0; j < table.length; j++) {
            for (int i = 0; i < table.length-1; i++) {
                if (table[i]>table[i+1]){
                    temp = table[i+1];
                    table[i+1] = table[i];
                    table[i] = temp;
                }
            }

        }
        for (int cos:table) {
            System.out.print(cos);
        }
    }
}
