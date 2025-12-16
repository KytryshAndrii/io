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

		String[] daneStudenta = _dao.znajdzStudenta(Nr);

		if (daneStudenta == null) {
			throw new IllegalArgumentException(
					"Student o numerze " + Nr + " nie znaleziony"
			);
		}

		IFabrykaUzytkownika fabryka = new FabrykaStudenta();

		return fabryka.utworzUzytkownika(daneStudenta);
	}
	public IUzytkownik dajAdministratora(int Nr) {

		String[] daneAdministratora = _dao.znajdzAdministratora(Nr);

		if (daneAdministratora == null) {
			throw new IllegalArgumentException(
					"Administrator o numerze " + Nr + " nie znaleziony"
			);
		}

		IFabrykaUzytkownika fabryka = new FabrykaAdministratora();

		return fabryka.utworzUzytkownika(daneAdministratora);
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

	public void usunStudentaZGrupy(int NrStudenta, int NrGrupy) {
        IGrupaZajeciowa grupa = dajGrupe(NrGrupy);
        int[] studenci = grupa.dajStudentow();

        _dao.wyrejestrujStudentaZGrupy(grupa.dajNrGrupy(), studenci[NrStudenta]);
 	}

	public void dodajStudentaDoGrupy(int NrStudenta, int NrGrupy) {
		IGrupaZajeciowa grupa = dajGrupe(NrGrupy);
        int[] studenci = grupa.dajStudentow();

        _dao.zarejestrujStudentaDoGrupy(grupa.dajNrGrupy(), studenci[NrStudenta]);
    }

	public void usunGrupe(int NrGrupy) {
		IGrupaZajeciowa grupa = dajGrupe(NrGrupy);

        _dao.usunGrupe(grupa.dajNrGrupy());
	}
}