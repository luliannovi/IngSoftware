package Composite.Parcheggio;

public abstract class ParcheggioComponent {
    public String nome;
    public String description;
    public void add(ParcheggioComponent parcheggioComponent){
        throw new UnsupportedOperationException();
    }
    public void remove(ParcheggioComponent parcheggioComponent) {
        throw new UnsupportedOperationException();
    }
    public ParcheggioComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }
    public String getName() {
        throw new UnsupportedOperationException();
    }
    public String getDescription() {
        throw new UnsupportedOperationException();
    }
    public void print() {
        throw new UnsupportedOperationException();
    }

}
