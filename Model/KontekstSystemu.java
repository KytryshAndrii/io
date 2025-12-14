package Model;

public class KontekstSystemu {
	private IDAO _dao;
	private IGrupaZajeciowa[] _grupyZajeciowe;
	private java.util.Vector<IUzytkownik[]> _uzytkownicy = null;

	public KontekstSystemu(IDAO Dao) {
		this._dao = Dao;
	}

	public IUzytkownik dajStudenta(int Nr) {
		throw new UnsupportedOperationException();
	}

	public IUzytkownik dajAdministratora(int Nr) {
		throw new UnsupportedOperationException("dajAdministratora() niezaimplementowana");
	}

	public IGrupaZajeciowa dajGrupe(int NrGrupy) {
		throw new UnsupportedOperationException("dajGrupe() niezaimplementowana");
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