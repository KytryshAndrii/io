package Model;

public class GrupaZajeciowa implements IGrupaZajeciowa {
	private int _nrGrupy;
	private int _iloscMiejsc;
	private int[] _studenty;
	private String _kierunek;
	private String _opisGrupy;

	public GrupaZajeciowa(int IloscMiejsc, int[] Studenty, String Kierunek, String OpisGrupy, int NrGrupy) {
//		throw new UnsupportedOperationException();
		this._iloscMiejsc = IloscMiejsc; // dany atrybut pokazuje ilosc pozostalych miejsc. Dazy do 0
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
		StringBuilder builder = new StringBuilder();
		builder.append(_nrGrupy).append(";");
		builder.append(_iloscMiejsc).append(";");

		// Konwersja tablicy studentów do formatu [1,2,3]
		if (_studenty != null) {
			for (int i = 0; i < _studenty.length; i++) {
				builder.append(_studenty[i]);
				if (i < _studenty.length - 1) {
					builder.append(",");
				}
			}
		}
		builder.append(";");

		builder.append(_kierunek).append(";");
		builder.append(_opisGrupy);

		return builder.toString();
	}
}