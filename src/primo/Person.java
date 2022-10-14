package primo;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    public List<Person> friends=new ArrayList<>();

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Person(String name){
        this.name=name;
    }
    public void say(){
        System.out.println("HELLO!");
    }
}
