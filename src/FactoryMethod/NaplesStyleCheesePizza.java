package FactoryMethod;

public class NaplesStyleCheesePizza extends Pizza {
    public NaplesStyleCheesePizza() {
        name = "Naples Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Mozzarella Cheese");
    }
}