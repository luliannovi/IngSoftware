package CommandCampane;

public abstract class Campana {
	public String suono ="campana";

	public String getSuono() {
		return suono;
	}

	public abstract void suona();
}
