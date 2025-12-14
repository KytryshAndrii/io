package Model;


public class Model implements IModel {
	private KontekstSystemu _kontekstSystemu;
	private IDAO _dao;

	public Model(KontekstSystemu KontekstSystemu, IDAO Dao) {
		this._kontekstSystemu = KontekstSystemu;
		this._dao = Dao;
	}

	public String znalezienieStudenta(int NrStudenta) {
		throw new UnsupportedOperationException();
	}

	public String[] znalezienieDostepnychGrupZajeciowych(int NrStudenta) {
		throw new UnsupportedOperationException();
	}

	public boolean weryfikacjaGrupyZajeciowej(int NrStudenta, int NrGrupy){
		IGrupaZajeciowa weryfikowanaGrupa = _kontekstSystemu.dajGrupe(NrGrupy);
	}

	public void zarejestrowanieZdarzenia(String Zdarzenie) {
		throw new UnsupportedOperationException();
	}

	public void usuniecieGrupyZajeciowej(int NrGrupy) {
		throw new UnsupportedOperationException();
	}

	public void udostepnienieGrupyDoRejestracji(int NrGrupy) {
		throw new UnsupportedOperationException();
	}

	public int tworzenieGrupyZajeciowej(String Grupa) {
		throw new UnsupportedOperationException();
	}

	public void edycjaGrupyZajeciowej(int NrGrupy) {
		throw new UnsupportedOperationException();
	}

	public void rejestracjaStudenta(int NrStudenta) {
		throw new UnsupportedOperationException();
	}

	public void wyrejestrowanieStudenta(int NrStudenta) {
		throw new UnsupportedOperationException();
	}
}