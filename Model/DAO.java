package Model;

public class DAO implements IDAO {

	public DAO() {

	}

	public void dodajWpisDoRejestruZdarzen(String Zdarzenie) {}

	public String znajdzStudenta(int aNrStudenta) {
		throw new UnsupportedOperationException();
	}

	public void edytujRejestracjiStudenta(int aNrStudenta) {
		throw new UnsupportedOperationException();
	}

	public void zarejestrujStudentaDoGrupy(int aNrGrupy) {
		throw new UnsupportedOperationException();
	}

	public void wyrejestrujStudentaZGrupy(int aNrGrupy) {
		throw new UnsupportedOperationException();
	}

	public String znajdzAdministratora(int aNrAdministratora) {
		throw new UnsupportedOperationException();
	}

	public String znajdzGrupe(int aNrGrupy) {
		throw new UnsupportedOperationException();
	}

	public int dodajGrupe(String aGrupa) {
		throw new UnsupportedOperationException();
	}

	public IGrupaZajeciowa[] znajdzGrupy() {
		throw new UnsupportedOperationException();
	}

	public IUzytkownik[] znajdzUzytkownikow(){throw new UnsupportedOperationException();}

	public void edytujLimitMiejscWGrupie(int aNrGrupy) {
		throw new UnsupportedOperationException();
	}

	public void usunGrupe(int aNrGrupy) {
		throw new UnsupportedOperationException();
	}

	public void edytujRejestracjeStudenta(int aNrStudenta) {
		throw new UnsupportedOperationException();
	}
}