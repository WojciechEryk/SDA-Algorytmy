package JulianIKornel.day14.task3;


public class HeterogeneousPair<F, S> {
    private final F first;
    private final S second;

    HeterogeneousPair(F first, S second) {                 //jak nie ma modyfikatorow dostepu, ten konstruktor bedzie dostepny tylko dla rzeczy w tej paczce
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}
