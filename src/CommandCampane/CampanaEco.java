package CommandCampane;

public class CampanaEco extends CampanaDecorator {
	public Campana c;
	public CampanaEco(Campana c) {
	this.c =c;
	}
	public String getSuono(){
		return c.getSuono() + " " + c.getSuono();
				
	}

	@Override
	public void suona() {
		System.out.println(getSuono());
	}


}
