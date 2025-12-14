package Model;

public interface IDAO {

	public void dodajWpisDoRejestruZdarzen(String Zdarzenie);

	public String znajdzStudenta(int aNrStudenta);

	public void edytujRejestracjeStudenta(int aNrStudenta);

	public void zarejestrujStudentaDoGrupy(int aNrGrupy);

	public void wyrejestrujStudentaZGrupy(int aNrGrupy);

	public String znajdzAdministratora(int aNrAdministratora);

	public String znajdzGrupe(int aNrGrupy);

	public int dodajGrupe(String aGrupa);

	public IGrupaZajeciowa[] znajdzGrupy();

	public IUzytkownik[] znajdzUzytkownikow();

	public void edytujLimitMiejscWGrupie(int aNrGrupy);

	public void usunGrupe(int aNrGrupy);
}