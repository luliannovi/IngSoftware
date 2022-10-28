package CommandCampane;

public class CampanaCommand extends CampanaDecorator implements Command {
	public Campana c;
	public CampanaCommand(Campana c) {
	this.c =c;
	}
	public String execute(){
		return getSuono();
				
	}
	@Override
	public String getSuono() {
		return c.getSuono();
	}

	@Override
	public void suona() {
		this.c.suona();
	}
}
