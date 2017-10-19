package JulianIKornel.day6.credit;

public class CreditBankX implements Credit {
    private int minValue = 1_000;                  //pola
    private int maxValue = 200_000;
    private int minTime = 6;
    private int maxTime = 48;

    private double rate1 = 1.025;
    private double rate2 = 1.05;
    private double rate3 = 1.1;
    private double rate1MaxRange = 12;
    private double rate2MaxRange = 24;

    @Override
    public double calculate(int value, int months) {
        if (value > maxValue || value < minValue) {              //te dwa ify sprawdzaja warunki poczatkowe, zakres kwot i czasu
            return 0;
        }
        if (months > maxTime || months < minTime) {
            return 0;
        }

        double sum;                                             // wlasciwa logika, obliczanie
        if (months <= rate1MaxRange) {
            sum = value * rate1;
        } else if (months <= rate2MaxRange) {
            sum = value * rate2;
        } else {
            sum = value * rate3;
        }


        return Math.round(sum / months);     // usuwa czesci dziesietne i setne, zakraglenie

    }


}
