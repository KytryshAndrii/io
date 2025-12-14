package Model;

public class GrupaZajeciowa implements IGrupaZajeciowa {
	private int _nrGrupy;
	private int _iloscMiejsc;
	private int[] _studenty;
	private String _kierunek;
	private String _opisGrupy;

	public GrupaZajeciowa(int IloscMiejsc, int[] Studenty, String Kierunek, String OpisGrupy, int NrGrupy) {
//		throw new UnsupportedOperationException();
		this._iloscMiejsc = IloscMiejsc;
		this._kierunek = Kierunek;
		this._nrGrupy = NrGrupy;
		this._studenty = Studenty;
		this._opisGrupy = OpisGrupy;
	}

	public int dajIloscMiejsc() {
		return _iloscMiejsc;
	}

	public int[] dajStudentow() {
		return _studenty;
	}

	public String dajKierunek() {
		return _kierunek;
	}

	public int dajNrGrupy() {
		return _nrGrupy;
	}

	public String dajOpisGrupy() {
		return _opisGrupy;
	}

	public String opisz() {
		return "Grupa zajeciowa nr ..... Dane gruy";
	}
}