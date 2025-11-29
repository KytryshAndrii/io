public class KontekstSystemu {
	private IDAO _dao;
	private IGrupaZajeciowa[] _grupyZajeciowe = null;
	private java.util.Vector<IUzytkownik[]> _uzytkownicy = null;

	public KontekstSystemu(IDAO aDao) {
		throw new UnsupportedOperationException();
	}

	public IUzytkownik dajStudenta(int aNr) {
		throw new UnsupportedOperationException();
	}

	public IUzytkownik dajAdministratora(int aNr) {
		throw new UnsupportedOperationException();
	}

	public IGrupaZajeciowa dajGrupe(int aNrGrupy) {
		throw new UnsupportedOperationException();
	}

	public IGrupaZajeciowa usunStudentaZGrupy(int aNrStudenta, int aNrGrupy) {
		throw new UnsupportedOperationException();
	}

	public IGrupaZajeciowa dodajStudentaDoGrupy(int aNrStudenta, int aNrGrupy) {
		throw new UnsupportedOperationException();
	}

	public IGrupaZajeciowa[] usunGrupe(int aNrGrupy) {
		throw new UnsupportedOperationException();
	}
}