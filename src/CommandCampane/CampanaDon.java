package CommandCampane;
public class CampanaDon extends Campana {
	public CampanaDon() {
suono = "don";
	}
	@Override
	public void suona() {
		System.out.println(suono);
	}
}
