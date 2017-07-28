package JulianIKornel.day14.zad2;


import java.util.ArrayList;

public class ContainerUtils {
    public static <T> ArrayList<T> listOff(T... items) {

        ArrayList<T> list = new ArrayList<>();
        for (T item : items) {
            list.add(item);
        }
        return list;
    }
}
