package JulianIKornel.day8JulianJurec.zadanie2;


public class Main {

    public static void main(String[] args) {

        Ingredient cheese = new Ingredient("cheese");
        Ingredient ham = new Ingredient("ham");
        Ingredient tomato = new Ingredient("tomato");
        Ingredient bread = new Ingredient("bread");

        Meal sandwich = new Meal();
        sandwich.addIngredient(cheese);
        sandwich.addIngredient(ham);
        sandwich.addIngredient(tomato);
        sandwich.addIngredient(bread);

        sandwich.printIngredients();

        Client julian = new Client();
        julian.addAllergie(tomato);


        System.out.println(julian.ifDead(sandwich));
    }
}
