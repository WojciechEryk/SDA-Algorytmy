package JulianIKornel.day8JulianJurec.zadanie1;


public class Main {
    public static void main(String[] args) {
        Place komin = new Place("Krzywy Komin", 4);
        Place hex = new Place("Hex", 1);
        Place czajownia = new Place("Czajownia", 2);

        Trip thursday = new Trip();
        thursday.addPlace(komin);
        thursday.addPlace(hex);
        thursday.addPlace(czajownia);

        thursday.setPlace(0, czajownia);
        thursday.printRoute();
        thursday.calculateDuration();
        System.out.println("Trip takes:  " + thursday.calculateDuration() + " hours.");
        System.out.println();

        thursday.removePlace(komin);
        thursday.printRoute();
        System.out.println("Trip takes:  " + thursday.calculateDuration() + " hours.");
        System.out.println();

    }
}
