package JulianIKornel.day6.geometry;


public abstract class Polygon extends Figure {

    private int numOfVerts;

    public Polygon(int numOfVerts) {
        this.numOfVerts = numOfVerts;
    }

    public int getNumOfVerts() {                                         // metoda zwracajaca ilosc wierzcholkow
        return numOfVerts;
    }
}
