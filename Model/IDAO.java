package Model;

public interface IDAO {

	public void dodajWpisDoRejestruZdarzen(String Zdarzenie);

	public String[] znajdzStudenta(int NrStudenta);

	public void edytujRejestracjeStudenta(int NrStudenta);

	public void zarejestrujStudentaDoGrupy(int NrGrupy, int NrStudenta);

	public void wyrejestrujStudentaZGrupy(int NrGrupy, int NrStudenta);

	public String[] znajdzAdministratora(int NrAdministratora);

	public String znajdzGrupe(int NrGrupy);

	public void dodajGrupe(String Grupa);

	public IGrupaZajeciowa[] znajdzGrupy();

	public IUzytkownik[] znajdzUzytkownikow();

	public void zwiekszLimitMiejscWGrupie(int NrGrupy);

	public void zmniejszLimitMiejscWGrupie(int NrGrupy);

	public void usunGrupe(int NrGrupy);
}