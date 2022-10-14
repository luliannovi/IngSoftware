package PCFactory;

public class Notebook extends PersonalComputer{
    public Notebook(){
        this.description="This is a Notebook!";
        this.cost=350;
    }
    @Override
    void setDescription(String description) {
        this.description=description;
    }

    @Override
    double getCost() {
        return this.cost;
    }

    @Override
    void setCost(double cost) {
        this.cost=cost;
    }
}
