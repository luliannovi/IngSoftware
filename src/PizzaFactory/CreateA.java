package PizzaFactory;

public class CreateA {
	public Pizza create(String tipo) {
		Pizza pizza = null;
		if (tipo.equals("margherita")){
			pizza = new Margherita();
		}

		return pizza;
	}
public CreateA() {
	
}
}
