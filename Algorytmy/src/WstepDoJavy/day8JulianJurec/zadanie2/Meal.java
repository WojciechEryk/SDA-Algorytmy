package JulianIKornel.day8JulianJurec.zadanie2;


import java.util.HashSet;

public class Meal {


    private HashSet<Ingredient> meal = new HashSet<>();  // Pole

    public void addIngredient(Ingredient ingredient) {
        meal.add(ingredient);
    }

    public void removeIngredient(Ingredient ingredient) {
        meal.remove(ingredient);
    }

    public HashSet<Ingredient> getIngriedents() {
        return meal;
    }

    public void printIngredients() {
        for (Ingredient ingredient : meal) {
            System.out.println(ingredient + ", ");
        }

    }
}
