package Model;

public interface IDAO {

	public void dodajWpisDoRejestruZdarzenie(String aZdarzenie);

	public Student znajdzStudenta(int aNrStudenta);

	public void edytujRejestracjeStudenta(int aNrStudenta);

	public void zarejestrujStudentaDoGrupy(int NrGrupy, int NrStudenta);

	public void wyrejestrujStudentaZGrupy(int NrGrupy, int NrStudenta);

	public Administrator znajdzAdministratora(int aNrAdministratora);

	public String znajdzGrupe(int aNrGrupy);

	public int dodajGrupe(String aGrupa);

	public IGrupaZajeciowa[] znajdzGrupy();

	public IUzytkownik[] znajdzUzytkownikow();

	public void edytujLimitMiejscWGrupie(int aNrGrupy);

	public void usunGrupe(int aNrGrupy);
}