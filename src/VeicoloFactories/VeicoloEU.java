package VeicoloFactories;

public class VeicoloEU extends Veicolo{
    public VeicoloEU(String name){
        this.name=name;
    }
    @Override
    protected String where() {
        return "EU";
    }

    @Override
    public String getName() {
        return this.name;
    }
}
