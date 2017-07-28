package JulianIKornel.day5;


import java.util.Random;

public class Array {

    private double[] array;  //nawiasy poprawniej umieszczac tutaj, ustawienie pola
    private double avg;          // pola powinny byc prywatne

    public Array(int n) {            // konstruktor, publiczny, Tablica, Argumenty
        this.array = new double[n];           //tworzenie tablicy
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextDouble() * 100;
        }
    }

    public void print()     // metoda od wyswietlania wierszy tablicy

    {
        int i = 1;
        for (double v : array) {
            System.out.println(String.format(i + ".      " + "%3.2f ", v));
            i++;
        }
    }

    public void printMinMax() {
        double min = Double.MAX_VALUE;
        double max = -Double.MIN_VALUE;

        for (double v : array) {
            if (v < min) {
                min = v;
            }
            if (v > max) {
                max = v;
            }
        }
        System.out.println(String.format("min: %3.2f, max: %3.2f.", min, max));
    }

    public void printAverage() {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        avg = sum / array.length;
        System.out.println(String.format("avg: %3.2f", avg));
    }

    public void printAverageMinMax() {
        System.out.println("Below avg:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < avg) {
                System.out.println(String.format("%3.2f", array[i]) + " ");
            }
        }
        System.out.println("");
        System.out.println("Under avg:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > avg) {
                System.out.println(String.format("%3.2f", array[i]) + " ");
            }
        }
    }


    public static void main(String[] args) {
        Array arr = new Array(10);

        arr.print();
        System.out.println();

        arr.printMinMax();
        System.out.println();

        arr.printAverage();
        System.out.println();

        arr.printAverageMinMax();
        System.out.println();


    }

}


