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
		IUzytkownik uzytkownikStudent = this._kontekstSystemu.dajStudenta(NrStudenta);
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
				this._kontekstSystemu.dajGrupe(NrGrupy);

		boolean czyGrupaPelna;
		if(weryfikowanaGrupa.dajIloscMiejsc() == 0){
			czyGrupaPelna = true;
		}else {
			czyGrupaPelna = false;
		}
		return czyGrupaPelna;
    }

	public boolean czyStudentJestWGrupie(int NrStudenta, int NrGrupy) {
		IGrupaZajeciowa grupa = this._kontekstSystemu.dajGrupe(NrGrupy);
		int[] studenci = grupa.dajStudentow();
		boolean czyStudentIstnieje;
        for (int student : studenci) {
            if (student == NrStudenta) {
                czyStudentIstnieje = true;
            }
        }
		czyStudentIstnieje = false;
		return czyStudentIstnieje;
	}

	public void zarejestrowanieZdarzenia(String Zdarzenie) {
		this._dao.dodajWpisDoRejestruZdarzen(Zdarzenie);
	}

	public void usuniecieGrupyZajeciowej(int NrGrupy) {
		this._kontekstSystemu.usunGrupe(NrGrupy);
	}

	public void udostepnienieGrupyDoRejestracji(int NrGrupy) {
		throw new UnsupportedOperationException();
	}

	public void tworzenieGrupyZajeciowej(String Grupa) {
		String[] pola = Grupa.split(";", 4);
		int nrGrupy = Integer.parseInt(pola[0]);

		IGrupaZajeciowa[] grupy = this._dao.znajdzGrupy();
		for (int i = 0; i < grupy.length; i++) {
			if ( grupy[i].dajNrGrupy() == nrGrupy) {
				throw new IllegalArgumentException("[ERROR] Grupa " + nrGrupy + " już istnieje!");
			}
		}
		this._dao.dodajGrupe(Grupa);
	}

	public void edycjaGrupyZajeciowej(int NrGrupy) {
		throw new UnsupportedOperationException();
	}

	public void rejestracjaStudenta(int NrStudenta, int NrGrupy) {
		this._kontekstSystemu.dodajStudentaDoGrupy(NrStudenta, NrGrupy);
	}

	public boolean wyrejestrowanieStudenta(int NrStudenta, int NrGrupy) {
		try {
			this._kontekstSystemu.usunStudentaZGrupy(NrStudenta, NrGrupy);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public void zmienLimitMiejscWGrupie(int NrGrupy, int NowyLimit) {
		IGrupaZajeciowa[] grupy = this._dao.znajdzGrupy();
		for (IGrupaZajeciowa grupa : grupy) {
			if (grupa.dajNrGrupy() == NrGrupy) {
				int iloscZapisanychStudentow = grupa.dajStudentow().length;

				if (NowyLimit < iloscZapisanychStudentow) {
					throw new IllegalArgumentException(
							"Nowy limit miejsc (" + NowyLimit + ") jest mniejszy niż liczba zapisanych studentów (" + iloscZapisanychStudentow + ")."
					);
				}

				this._dao.ustawLimitMiejscWGrupie(NrGrupy, NowyLimit);
				return;
			}
		}
		throw new IllegalArgumentException("Grupa o numerze " + NrGrupy + " nie istnieje.");
	}

	public String[] dajDaneWszystkichGrup() {
		IGrupaZajeciowa[] grupy = this._dao.znajdzGrupy();
		List<String> wynik = new ArrayList<>();
		for (IGrupaZajeciowa grupa : grupy) {
			wynik.add(grupa.opisz());
		}
		return wynik.toArray(new String[0]);
	}
}