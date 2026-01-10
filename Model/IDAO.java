package Model;

public interface IDAO {

	public void dodajWpisDoRejestruZdarzen(String Zdarzenie);

	public String[] znajdzStudenta(int aNrStudenta);

	public void edytujRejestracjeStudenta(int aNrStudenta);

	public void zarejestrujStudentaDoGrupy(int NrGrupy, int NrStudenta);

	public void wyrejestrujStudentaZGrupy(int NrGrupy, int NrStudenta);

	public String[] znajdzAdministratora(int aNrAdministratora);

	public String znajdzGrupe(int aNrGrupy);

	public int dodajGrupe(String aGrupa);

	public IGrupaZajeciowa[] znajdzGrupy();

	public IUzytkownik[] znajdzUzytkownikow();

	public void zwiekszLimitMiejscWGrupie(int NrGrupy);

	public void zmniejszLimitMiejscWGrupie(int NrGrupy);

	public void usunGrupe(int aNrGrupy);
}