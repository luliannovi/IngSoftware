package CommandCampane;
public class CampanaDin extends Campana {
	public CampanaDin() {
	 suono = "din";
	}
	@Override
	public void suona() {
		System.out.println(suono);
	}
}
