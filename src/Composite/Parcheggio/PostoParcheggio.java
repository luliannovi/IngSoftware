package Composite.Parcheggio;

public class PostoParcheggio {
    int numero;
    double dimensione;
    boolean libero;

    public PostoParcheggio(int numero, double dimensione, boolean libero) {
        this.numero = numero;
        this.dimensione = dimensione;
        this.libero = libero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getDimensione() {
        return dimensione;
    }

    public void setDimensione(double dimensione) {
        this.dimensione = dimensione;
    }

    public boolean isLibero() {
        return libero;
    }

    public void setLibero(boolean libero) {
        this.libero = libero;
    }
}
