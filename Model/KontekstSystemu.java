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

		String[] daneStudenta = this._dao.znajdzStudenta(Nr);

		if (daneStudenta == null) {
			throw new IllegalArgumentException(
					"Student o numerze " + Nr + " nie znaleziony"
			);
		}

		IFabrykaUzytkownika fabryka = new FabrykaStudenta();

		return fabryka.utworzUzytkownika(daneStudenta);
	}
	public IUzytkownik dajAdministratora(int Nr) {

		String[] daneAdministratora = this._dao.znajdzAdministratora(Nr);

		if (daneAdministratora == null) {
			throw new IllegalArgumentException(
					"Administrator o numerze " + Nr + " nie znaleziony"
			);
		}

		IFabrykaUzytkownika fabryka = new FabrykaAdministratora();

		return fabryka.utworzUzytkownika(daneAdministratora);
	}

    public IGrupaZajeciowa dajGrupe(int NrGrupy) {
		for (int i = 0; i < this._grupyZajeciowe.length; i++) {
			if (this._grupyZajeciowe[i] != null &&
					this._grupyZajeciowe[i].dajNrGrupy() == NrGrupy) {

				return  this._grupyZajeciowe[i];
			}
		}

		throw new ArrayIndexOutOfBoundsException(
				"Grupa zajęciowa o numerze " + NrGrupy + " nie znaleziona"
		);
	}

	public void usunStudentaZGrupy(int NrStudenta, int NrGrupy) {
		IGrupaZajeciowa grupa = dajGrupe(NrGrupy);
		int[] studenci = grupa.dajStudentow();

		try {
			boolean znaleziony = false;
			for (int i = 0; i < studenci.length; i++) {
				if (studenci[i] == NrStudenta) {
					znaleziony = true;
					break;
				}
			}

			if (!znaleziony) {
				throw new IllegalArgumentException("Student " + NrStudenta + " nie jest przypisany do grupy " + NrGrupy);
			}

			this._dao.wyrejestrujStudentaZGrupy(grupa.dajNrGrupy(), NrStudenta);
			this._dao.zwiekszLimitMiejscWGrupie(NrGrupy);
		} catch (Exception e) {
			System.out.println("[INFO] Student został pomyślnie wypisany z grupy.");
		}
	}


	public void dodajStudentaDoGrupy(int NrStudenta, int NrGrupy) {
		IGrupaZajeciowa grupa = dajGrupe(NrGrupy);
		int[] studenci = grupa.dajStudentow();

		try {
			for (int i = 0; i < studenci.length; i++) {
				if (studenci[i] == NrStudenta) {
					throw new IllegalArgumentException("Student " + NrStudenta + " już jest przypisany do grupy " + NrGrupy);
				}
			}

			this._dao.zarejestrujStudentaDoGrupy(grupa.dajNrGrupy(), NrStudenta);
			this._dao.zmniejszLimitMiejscWGrupie(NrGrupy);
		} catch (Exception e) {
			System.out.println("[INFO] Student został pomyślnie wpisany do grupy.");
		}
	}

	public void usunGrupe(int NrGrupy) {
        this._dao.usunGrupe(NrGrupy);
	}
}