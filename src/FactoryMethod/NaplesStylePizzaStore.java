package FactoryMethod;

public class NaplesStylePizzaStore extends PizzaStore {
    public Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NaplesStyleCheesePizza();
        } /*else if (item.equals("veggie")) {
            return new NaplesStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NaplesStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NaplesStylePepperoniPizza();
        }*/ else return null;
    }
}
