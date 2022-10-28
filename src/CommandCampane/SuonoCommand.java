package CommandCampane;

public class SuonoCommand implements Command{
    Campana campana;
    public SuonoCommand(Campana campana){
        this.campana = campana;
    }
    @Override
    public String execute() {
        this.campana.suona();
        return this.campana.suono;
    }
}
