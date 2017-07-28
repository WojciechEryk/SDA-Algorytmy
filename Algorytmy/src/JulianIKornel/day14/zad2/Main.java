package JulianIKornel.day14.zad2;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        ArrayList<String> strings = ContainerUtils.listOff("1", "2", "3", "4");
        System.out.println(strings);

        ArrayList<Integer> numbers = ContainerUtils.listOff(1, 2, 3, 4, 5, 6, 7);
        System.out.println(numbers);
    }
}
