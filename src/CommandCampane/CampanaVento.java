package CommandCampane;

public class CampanaVento extends CampanaDecorator {
	public Campana c;
	public CampanaVento(Campana c) {
	this.c =c;
	}
	public String getSuono(){
		return c.getSuono() + " ffff ";
				
	}

	@Override
	public void suona() {
		System.out.println(getSuono());
	}
}
