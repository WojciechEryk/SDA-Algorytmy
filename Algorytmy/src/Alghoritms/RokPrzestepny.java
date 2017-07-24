package Alghoritms;

/**
 * Created by RENT on 2017-07-24.
 */
public class RokPrzestepny extends AbstractAlgorithm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgorithm(String[] input) {
        int year = 0;
        for (int i = 1; i <input.length ; i++) {
            year = Integer.parseInt(input[i]);
            if ((year%4==0 && year%100!=0) || (year%400==0)){
                System.out.println("True " + input[i]);
            }else{
                System.out.println("False " + input[i] );
            }
        }

    }
}
