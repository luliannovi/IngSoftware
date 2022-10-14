package PCFactory;

public class Desktop extends PersonalComputer{
    public Desktop(){
        this.description="This is a desktop PC";
        this.cost=400;
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
