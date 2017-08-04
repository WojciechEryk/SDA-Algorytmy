package Alghoritms;


import java.util.ArrayList;

public class ArrayListZadanko extends AbstractAlgorithm{
    @Override
    public String getName() {
        return " Array List Zadanko";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int toDelate = Integer.parseInt(input[1]);
        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 2; i < input.length; i++) {
            list.add(Integer.parseInt(input[i]));
        }
        System.out.printf("Element do usuwania: " + toDelate);
        System.out.println();
        System.out.printf("Nasze wartośći: { ");
        for (int i :list) {
            System.out.print(i+ ", ");
        }System.out.printf("}");

        for (int i = 0; i <list.size() ; i++) {
            if ((toDelate)==list.get(i)){
                list.remove(i);
                i--;
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("---------------------");
        System.out.println();

        System.out.printf("Nasze wartośći po usunięciu: { ");
        for (int i :list) {
            System.out.print(i+ ", ");
        }
        System.out.printf("}");

    }
}
