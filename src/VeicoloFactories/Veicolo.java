package VeicoloFactories;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Veicolo {
    String name;
    String motore;
    ArrayList<String> carrozzeria = new ArrayList<>();
    ArrayList<String> interni = new ArrayList<>();
    void made(){
        System.out.println("made up the "+ name+" car!\n");
    }
    protected abstract String where();

    public abstract java.lang.String getName() ;
}
