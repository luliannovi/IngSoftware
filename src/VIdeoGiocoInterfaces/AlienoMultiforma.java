package VIdeoGiocoInterfaces;

public class AlienoMultiforma extends Character {
    public AlienoMultiforma() {
        fightBehavior = new BlobVelenoso();
        moves = new Teletransport();
    }
    public void display() {
        System.out.println("I'm a Alieno Multiforma");
    }

}