package FactoryMethod;

public class MilanStyleCheesePizza extends Pizza {
    public MilanStyleCheesePizza() {
        name = "Milan Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Grated Cheese");
    }
    void cut() {
        System.out.println("Cutting the pizza into squared slices");
    }
}
