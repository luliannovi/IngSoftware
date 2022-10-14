package VeicoloFactories;

public class VeicoloUSA extends Veicolo{
    public VeicoloUSA(String nome) {
        this.name=nome;
    }

    @Override
    protected String where() {
        return "USA";
    }

    @Override
    public String getName() {
        return this.name;
    }
}
