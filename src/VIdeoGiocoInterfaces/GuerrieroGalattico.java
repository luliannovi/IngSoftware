package VIdeoGiocoInterfaces;

public class GuerrieroGalattico extends Character {
    public GuerrieroGalattico() {
        fightBehavior = new FucilePlasma();
        moves = new InterstellarShip();
    }
    public void display() {
        System.out.println("I'm a Guerriero Galattico");
    }

    public void switchMoves(){
        if(moves instanceof InterstellarShip){
            moves=new SubsonicMoto();
        }else{
            moves=new InterstellarShip();
        }
    }
    public void switchToPistolaLaser(){
        fightBehavior=new PistolaLaser();
    }
    public void switchToPlasma(){
        fightBehavior=new FucilePlasma();
    }
}
