package JulianIKornel.day2;

import java.util.logging.Logger;

/**
 * Created by RENT on 2017-06-28.
 */
public class Main {

    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {


        Exams exams = new Exams();
        log.info(exams.toString());  //Logger sprawdza i wyswietla na czerwono dane
        // System.out.println(exams.toString()); //Skrot "soutp" wyswietla to samo


        //reczne ustawienie zmiennych :) potem zrobilismy dane w konsruktorze
        exams.setMath(3.0f);
        exams.setEnglish(2.0f);// F jest po to aby odczytal liczby jako floaty
        exams.setPolish(3.5f);
        log.info(exams.toString());


        Exams exmas2;
        Exams exams2 = new Exams(4f, 3.5f, 3.5f);
        log.info(exams2.toString());   //Tu musialem loggera zmienic exams na exams2
        // log.info("Srednia to "+exams2.avg());        //Tu looger otrzymal exams2 i avg czyli adnotacje do metody wylicajaca srednia
        // log.info(String.format("Srednia: %.2f", exams2.avg()));      //Zaokraglenie do 2 miejsc po przecinku, przeformatowanie tekstu

        exams.passed();
        //log.info("Passed exans: " + exams.passed());
        exams2.passed();
        //log.info("Passed exans: " +exams2.passed());


        int numOfExams = 4;
        Exams[] list = new Exams[numOfExams];
        list[0] = new Exams(3, 2, 5);
        list[1] = new Exams(5, 2, 3.5f);
        list[2] = new Exams(2, 2, 3);
        list[3] = new Exams(3.5f, 2, 4.5f);

        log.info("Passed:");
        for (Exams ex : list) {
            if (ex.passed()) {
                log.info(ex.toString());
            }
        }
        log.info("Failed:");
        for (int i = 0; i < list.length; i++) {
            if (!list[i].passed()) {                       // "!" odwraca warunek
                log.info(exams.toString());
                list[i].retestAll();

                if (list[i].passed()) ;
                log.info("Retest passed!");
            }
        }
    }
}
