package CommandCampane;

public class CampanaBeeper extends Campana {
    Beeper beeper;

    CampanaBeeper(){
        this.beeper = new Beeper();
    }
    @Override
    public void suona() {
        System.out.println(this.beeper.getSound());
    }
}
