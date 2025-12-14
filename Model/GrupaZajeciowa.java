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
		throw new UnsupportedOperationException();
	}

	public int[] dajStudentow() {
		throw new UnsupportedOperationException();
	}

	public String dajKierunek() {
		throw new UnsupportedOperationException();
	}

	public String dajOpisGrupy() {
		throw new UnsupportedOperationException();
	}

	public String opisz() {
		throw new UnsupportedOperationException();
	}

	public int dajNrGrupy() {
		throw new UnsupportedOperationException();
	}
}