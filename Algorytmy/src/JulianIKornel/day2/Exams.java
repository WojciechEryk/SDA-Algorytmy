package JulianIKornel.day2;

import java.util.Random;

/**
 * Created by RENT on 2017-06-28.
 */
public class Exams {

    private float math;
    private float polish;
    private float english;

    private static Random rand = new Random();


    public Exams() {
    }

    //Ustawienie exams2
    public Exams(float math, float polish, float english) {
        this.math = math;
        this.english = english;
        this.polish = polish;
    }

    //Ustawienie ocen
    public void setMath(float grade) {
        this.math = grade;
    }

    public void setPolish(float grade) {
        this.polish = grade;
    }

    public void setEnglish(float grade) {
        this.english = grade;
    }

    public float avg() {
        return (math + english + polish) / 3;
    }

    public boolean passed() {
        return math > 2 && polish > 2 && english > 2;
    }

    public void retestAll() {

        if (math < 3) {
            math = retest();
        }

        if (english < 3) {
            english = retest();
        }

        if (polish < 3) {
            polish = retest();
        }
    }

    private float retest() {

        if (rand.nextBoolean()) {
            return 3;
        } else {
            return 2;
        }


    }

    @Override
    public String toString() {
        return "Exams{" +
                "math=" + math +
                ", polish=" + polish +
                ", english=" + english +
                ", average=" + String.format("%.2f", avg()) + //tutaj to samo co loggerze ale bez exams2
                ", passed=" + passed() +                     //dodalismy sprawdzenie czy ktos zdal
                '}';


    }


}
