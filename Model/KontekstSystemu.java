package Model;

public class KontekstSystemu {
	private IDAO _dao;
	private IGrupaZajeciowa[] _grupyZajeciowe;
	private IUzytkownik[] _uzytkownicy;

	public KontekstSystemu(IDAO Dao) {
		this._dao = Dao;
		this._grupyZajeciowe = Dao.znajdzGrupy();
		this._uzytkownicy = Dao.znajdzUzytkownikow();
	}

	public IUzytkownik dajStudenta(int Nr) {
		throw new UnsupportedOperationException();
	}

	public IUzytkownik dajAdministratora(int Nr) {
		throw new UnsupportedOperationException("dajAdministratora() niezaimplementowana");
	}

	public IGrupaZajeciowa dajGrupe(int NrGrupy) {
		for (int i = 0; i < _grupyZajeciowe.length; i++) {
			if (_grupyZajeciowe[i] != null &&
					_grupyZajeciowe[i].dajNrGrupy() == NrGrupy) {

				return  _grupyZajeciowe[i];
			}
		}

		throw new ArrayIndexOutOfBoundsException(
				"Grupa zajęciowa o numerze " + NrGrupy + " nie znaleziona"
		);
	}

	public IGrupaZajeciowa usunStudentaZGrupy(int NrStudenta, int NrGrupy) {
		throw new UnsupportedOperationException();
	}

	public IGrupaZajeciowa dodajStudentaDoGrupy(int NrStudenta, int NrGrupy) {
		throw new UnsupportedOperationException("dodajStudentaDoGrupy() niezaimplementowana");
	}

	public IGrupaZajeciowa[] usunGrupe(int NrGrupy) {
		throw new UnsupportedOperationException();
	}
}