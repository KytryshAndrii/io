package Model;

public class DAO implements IDAO {

	public DAO() {

	}

	public void dodajWpisDoRejestruZdarzen(String Zdarzenie) {}

	public String[] znajdzStudenta(int aNrStudenta) {
		return new String[] { "1", "Grzegorz", "Braun", "gbraun@gmail.com", "000000", "zarządzanie gasnicą"};
	}

	public void edytujRejestracjiStudenta(int NrStudenta) {
		throw new UnsupportedOperationException();
	}

	public void zarejestrujStudentaDoGrupy(int NrGrupy, int NrStudenta) {
		throw new UnsupportedOperationException();
	}

	public void wyrejestrujStudentaZGrupy(int NrGrupy, int NrStudenta) {
		throw new UnsupportedOperationException();
	}

	public String[] znajdzAdministratora(int aNrAdministratora) {
		return new String[] { "0", "Karol", "Nawrocki", "knawrocki@gmail.com"};
	}

	public String znajdzGrupe(int aNrGrupy) {
		throw new UnsupportedOperationException();
	}

	public void dodajGrupe(String Grupa) {
		String[] pola = Grupa.split(";", 4);
		int nrGrupy = Integer.parseInt(pola[0]);
		int iloscMiejsc = Integer.parseInt(pola[1]);
		String kierunek = pola[2];
		String opis = pola[3];
		int[] studenci = new int[0];
	}

	public IGrupaZajeciowa[] znajdzGrupy() {
		throw new UnsupportedOperationException();
	}

	public IUzytkownik[] znajdzUzytkownikow(){throw new UnsupportedOperationException();}

	public void zwiekszLimitMiejscWGrupie(int NrGrupy) {
		return;
	}
	public void zmniejszLimitMiejscWGrupie(int NrGrupy){
		return;
	}

	public void usunGrupe(int NrGrupy) {
		throw new UnsupportedOperationException();
	}

	public void edytujRejestracjeStudenta(int NrStudenta) {
		throw new UnsupportedOperationException();
	}

	public void ustawLimitMiejscWGrupie(int NrGrupy, int nowyLimitMiejsc){
		return;
	}
}