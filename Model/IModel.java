package Model;

public interface IModel {

	public String znalezienieStudenta(int aNrStudenta);

	public String[] znalezienieDostepnychGrupZajeciowych(int aNrStudenta);

	public void zarejestrowanieZdarzenia(String aZdarzenie);

	public void usuniecieGrupyZajeciowej(int aNrGrupy);

	public void udostepnienieGrupyDoRejestracji(int aNrGrupy);

	public int tworzenieGrupyZajeciowej(String aGrupa);

	public void edycjaGrupyZajeciowej(int aNrGrupy);

	public void rejestracjaStudenta(int aNrStudenta);

	public void wyrejestrowanieStudenta(int aNrStudenta);
}