package CommandCampane;

public class CampanaTic extends CampanaDecorator {
	public Campana c;
	public CampanaTic(Campana c) {
	this.c =c;
	}
	public String getSuono(){
		return c.getSuono() + " tic ";
				
	}

	@Override
	public void suona() {
		System.out.println(getSuono());
	}
}
