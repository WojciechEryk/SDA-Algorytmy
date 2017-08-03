package Alghoritms;

/**
 * Created by RENT on 2017-08-03.
 */
public class TestujemyKopiec extends AbstractAlgorithm {
    @Override
    public String getName() {
        return " Test Kopca";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int n = input.length-1;
        Kopiec kopiec = new Kopiec(n);

        for (int i = 1; i < input.length ; i++) {
            int newElement = Integer.parseInt(input[i]);
            kopiec.addNewElement(newElement);

        }

    }
}
