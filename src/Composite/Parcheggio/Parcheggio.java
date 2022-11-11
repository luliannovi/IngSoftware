package Composite.Parcheggio;

import java.util.ArrayList;
import java.util.Iterator;

public class Parcheggio extends ParcheggioComponent{
    public String name;
    public String description;
    ArrayList<ParcheggioComponent> parcheggioComponents = new ArrayList<ParcheggioComponent>();
    public Parcheggio(String name, String description){
        this.name=name;
        this.description=description;
    }
    public void add(ParcheggioComponent parcheggioComponent) {
        parcheggioComponents.add(parcheggioComponent); }
    public void remove(ParcheggioComponent parcheggioComponent) {
        parcheggioComponents.remove(parcheggioComponent);
    }
    public ParcheggioComponent getChild(Integer i) {
        return parcheggioComponents.get(i); }
    public String getName() {
        return name; }
    public String getDescription() {
        return description;
    }
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");
        Iterator<ParcheggioComponent> iterator = parcheggioComponents.iterator();
        while (iterator.hasNext()) {
            ParcheggioComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }

}
