package JulianIKornel.day8JulianJurec.zadanie2;


public class Ingredient {
    private String name;

    public Ingredient(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Ingredient{" + "name='" + name + '\'' + '}';
    }


}



