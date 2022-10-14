package VeicoloFactories;

public class VeicoloEUAssembler extends VeicoloAssembler{
    @Override
    protected Veicolo assemblaVeicolo(String nome) {
        return new VeicoloEU(nome);
    }
}
