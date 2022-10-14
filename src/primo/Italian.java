package primo;

public class Italian extends Person{
    public Italian(String name,int age) {
        super(name,age);
    }

    public void parla(){
        System.out.println("Ciao mondo!");
    }

    @Override
    public void say() {
        parla();
    }
}
