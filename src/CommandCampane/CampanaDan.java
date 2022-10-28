package CommandCampane;

public class CampanaDan extends Campana {
	public CampanaDan() {
		suono = "dan";
	}

	@Override
	public void suona() {
		System.out.println(suono);
	}
}
