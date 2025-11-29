public class Model implements IModel {
	private KontekstSystemu _kontekstSystemu;
	private IDAO _dao;

	public Model(KontekstSystemu aKontekstSystemu, IDAO aDao) {
		throw new UnsupportedOperationException();
	}

	public String znalezienieStudenta(int aNrStudenta) {
		throw new UnsupportedOperationException();
	}

	public String[] znalezienieDostepnychGrupZajeciowych(int aNrStudenta) {
		throw new UnsupportedOperationException();
	}

	public void zarejestrowanieZdarzenia(String aZdarzenie) {
		throw new UnsupportedOperationException();
	}

	public void usuniecieGrupyZajeciowej(int aNrGrupy) {
		throw new UnsupportedOperationException();
	}

	public void udostepnienieGrupyDoRejestracji(int aNrGrupy) {
		throw new UnsupportedOperationException();
	}

	public int tworzenieGrupyZajeciowej(String aGrupa) {
		throw new UnsupportedOperationException();
	}

	public void edycjaGrupyZajeciowej(int aNrGrupy) {
		throw new UnsupportedOperationException();
	}

	public void rejestracjaStudenta(int aNrStudenta) {
		throw new UnsupportedOperationException();
	}

	public void wyrejestrowanieStudenta(int aNrStudenta) {
		throw new UnsupportedOperationException();
	}
}