package VIdeoGiocoInterfaces;

public class Character{
    FightBehavior fightBehavior;
    Moves moves;
    // more
    public void performFight() {
        fightBehavior.fight();
    }
}