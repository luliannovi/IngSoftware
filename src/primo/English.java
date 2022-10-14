package primo;

public class English extends Person{
    public English(String name,int age) {
        super(name,age);
    }
    public English(String name){
        super(name);
    }
    public void speak(){
        System.out.println("Hello World!");
    }
    @Override
    public void say() {
        speak();
    }
}
