package PCFactory;

public abstract class PersonalComputer {
    String description = "Personal Computer";
    double cost = 100;
    String getDescription(){
        return description;
    };
    abstract void setDescription(String description);
    abstract double getCost();
    abstract void setCost(double cost);

}
