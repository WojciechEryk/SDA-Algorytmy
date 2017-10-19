package JulianIKornel.day8JulianJurec.zadanie2;


import java.util.HashSet;

public class Client {
    private HashSet<Ingredient> allergies = new HashSet<>();

    public void addAllergie(Ingredient allergen) {
        allergies.add(allergen);
    }

    public boolean ifDead(Meal meals) {
        for (Ingredient allergen : allergies) {
            return (meals.getIngriedents().contains(allergen));


        }
        return false;

    }
}