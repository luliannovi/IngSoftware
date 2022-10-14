package VeicoloFactories;

public class VeicoloUSAAssembler extends VeicoloAssembler{
    @Override
    protected Veicolo assemblaVeicolo(String nome) {
        return new VeicoloUSA(nome);
    }
}
