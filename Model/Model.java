package Model;


import java.util.ArrayList;
import java.util.List;

public class Model implements IModel {
	private KontekstSystemu _kontekstSystemu;
	private IDAO _dao;

	public Model(KontekstSystemu KontekstSystemu, IDAO Dao) {
		this._kontekstSystemu = KontekstSystemu;
		this._dao = Dao;
	}

	public String znalezienieStudenta(int NrStudenta) {
		throw new UnsupportedOperationException();
	}

	public String[] znalezienieDostepnychGrupZajeciowych(int NrStudenta) {
		IUzytkownik uzytkownikStudent = _kontekstSystemu.dajStudenta(NrStudenta);
		Student student = (Student) uzytkownikStudent;
		IGrupaZajeciowa[] grupy = this._dao.znajdzGrupy();

		List<String> wynik = new ArrayList<>();
		for (IGrupaZajeciowa grupa : grupy) {
			if (grupa.dajKierunek().equals(student.dajKierunek())) {
				wynik.add(grupa.opisz());
			}
		}
		return wynik.toArray(new String[0]);
	}

	public boolean czyGrupaZajeciowaJestPelna( int NrGrupy){
		IGrupaZajeciowa weryfikowanaGrupa =
				_kontekstSystemu.dajGrupe(NrGrupy);

        return weryfikowanaGrupa.dajIloscMiejsc() == 0;
    }

	public boolean czyStudentJestWGrupie(int NrStudenta, int NrGrupy) {
		IGrupaZajeciowa grupa = _kontekstSystemu.dajGrupe(NrGrupy);
		int[] studenci = grupa.dajStudentow();

		for (int i = 0; i < studenci.length; i++) {
			if (studenci[i] == NrStudenta) {
				return true;
			}
		}
		return false;
	}

	public void zarejestrowanieZdarzenia(String Zdarzenie) {
		_dao.dodajWpisDoRejestruZdarzen(Zdarzenie);
	}

	public void usuniecieGrupyZajeciowej(int NrGrupy) {
		throw new UnsupportedOperationException();
	}

	public void udostepnienieGrupyDoRejestracji(int NrGrupy) {
		throw new UnsupportedOperationException();
	}

	public int tworzenieGrupyZajeciowej(String Grupa) {
		throw new UnsupportedOperationException();
	}

	public void edycjaGrupyZajeciowej(int NrGrupy) {
		throw new UnsupportedOperationException();
	}

	public void rejestracjaStudenta(int NrStudenta, int NrGrupy) {
		_kontekstSystemu.dodajStudentaDoGrupy(NrStudenta, NrGrupy);
	}

	public void wyrejestrowanieStudenta(int NrStudenta) {
		throw new UnsupportedOperationException();
	}
}