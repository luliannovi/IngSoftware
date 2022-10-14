package VeicoloFactories;

public abstract class VeicoloAssembler {
    Veicolo veicolo;
    protected abstract Veicolo assemblaVeicolo(String nome);
}
