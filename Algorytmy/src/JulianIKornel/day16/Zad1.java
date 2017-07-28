//package day16;
//
//
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Zad1 {
//    public static void main(String[] args) {
//        ArrayList<String> people = new ArrayList<>();
//        Collections.addAll(people, "Kawalski", "Nowask", "Kbwalska", "Dupa", "ZZZZ", "XXXXX", "KKKK", "YYYYYY");
//        int i = 1;
//
//
//        people.stream()
//                .map(s -> s.toUpperCase())
//                .sorted((s1, s2) -> new Character(s2.charAt(1))
//                        .compareTo(s1.charAt(1)))
//                .forEach(System.out.println(i++ + ". "), e -> System.out.println(e));
//    }
//}
