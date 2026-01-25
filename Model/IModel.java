package Model;

public interface IModel {

	public String znalezienieStudenta(int aNrStudenta);

	public String[] znalezienieDostepnychGrupZajeciowych(int aNrStudenta);

	public boolean czyGrupaZajeciowaJestPelna(int NrGrupy);

	public boolean czyStudentJestWGrupie(int NrStudenta, int NrGrupy);

	public void zarejestrowanieZdarzenia(String Zdarzenie);

	public void usuniecieGrupyZajeciowej(int NrGrupy);

	public void tworzenieGrupyZajeciowej(String Grupa);

	public void rejestracjaStudenta(int NrStudenta, int NrGrupy);

	public boolean wyrejestrowanieStudenta(int NrStudenta, int NrGrupy);

	public void zmienLimitMiejscWGrupie(int NrGrupy, int NowyLimit);

	public String[] dajDaneWszystkichGrup();
}