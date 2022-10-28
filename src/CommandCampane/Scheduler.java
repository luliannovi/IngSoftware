package CommandCampane;

public class Scheduler {
public Command command;

public void setCommand(Command command) {
	this.command = command;
}

public void suona() {
	System.out.println(command.execute());
	
}

}
