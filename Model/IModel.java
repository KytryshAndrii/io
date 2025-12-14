package Model;

public interface IModel {

	public String znalezienieStudenta(int aNrStudenta);

	public String[] znalezienieDostepnychGrupZajeciowych(int aNrStudenta);

	public boolean czyGrupaZajeciowaJestPelna(int NrGrupy);

	public boolean czyStudentJestWGrupie(int NrStudenta, int NrGrupy);

	public void zarejestrowanieZdarzenia(String aZdarzenie);

	public void usuniecieGrupyZajeciowej(int aNrGrupy);

	public void udostepnienieGrupyDoRejestracji(int aNrGrupy);

	public int tworzenieGrupyZajeciowej(String aGrupa);

	public void edycjaGrupyZajeciowej(int aNrGrupy);

	public void rejestracjaStudenta(int NrStudenta, int NrGrupy);

	public void wyrejestrowanieStudenta(int aNrStudenta);
}