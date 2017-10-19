package JulianIKornel.day14.zad1;

/**
 * Created by RENT on 2017-07-14.
 */
public class Excercises {

    public static class Pair<T> {
        private final T fisrt;
        private final T second;

        public Pair(T fisrt, T second) {
            this.fisrt = fisrt;
            this.second = second;
        }

        public T getFisrt() {
            return fisrt;
        }

        public T getSecond() {
            return second;
        }
    }

    public static class Triple<T> extends Pair<T> {
        private final T third;

        public Triple(T fisrt, T second, T third) {
            super(fisrt, second);
            this.third = third;
        }

        public T getThird() {
            return third;
        }
    }


    public static void main(String[] args) {
        Pair<String> name = new Pair<>("Julian", "Jurec");
        System.out.println(name.getFisrt());
        System.out.println(name.second);
        System.out.println();

        Triple<Integer> triple = new Triple<>(1, 2, 3);
        System.out.println(triple.getFisrt().toString() + " " + triple.getThird().toString() + " " + triple.getSecond().toString());
        System.out.println();
    }
}
