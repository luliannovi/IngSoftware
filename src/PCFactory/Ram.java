package PCFactory;

public class Ram extends ComponentDecorator{
    PersonalComputer personalComputer;
    double cost;
    double dimensione;
    public Ram(PersonalComputer personalComputer){
        this.personalComputer=personalComputer;
    }
    @Override
    void setDescription(String description) {
        this.description = personalComputer.getDescription() + description;
    }

    @Override
    double getCost() {
        return this.personalComputer.cost +this.cost;
    }

    @Override
    void setCost(double cost) {
        this.cost=cost;
    }
}
