package Composite.Parcheggio;

import java.util.ArrayList;

public class Area extends ParcheggioComponent{
    public ArrayList<PostoParcheggio> posti = new ArrayList<PostoParcheggio>();
    public String name;
    public String description;

    public Area(ArrayList<PostoParcheggio> posti, String name, String description) {
        this.posti = posti;
        this.name = name;
        this.description = description;
    }

    public ArrayList<PostoParcheggio> getPosti() {
        return posti;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
    public void print() {
        System.out.print(" " + getName());
        System.out.println(" -- " + getDescription());
        for(PostoParcheggio p : posti){
            System.out.println("Posto numero: "+p.getNumero()+" --> libero: "+p.isLibero());
        }
    }
}
