package PCFactory;

public abstract class ComponentDecorator extends PersonalComputer{
    PersonalComputer personalComputer;
    String getDescription(){
        return personalComputer.getDescription();
    }
}
