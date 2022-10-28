package CommandCampane;

public class EffettoVento extends CampanaDecorator{
    EffettoVento(Campana campana) {
        this.campana=campana;
        this.campana.suono = this.campana.suono + "FFF";
    }


    @Override
    public void suona() {
        campana.suona();
    }
}
