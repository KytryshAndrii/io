package Model;

public abstract class Uzytkownik implements IUzytkownik {
	protected IUzytkownik _uzytkownik;

	public Uzytkownik(IUzytkownik uzytkownik) {
        this._uzytkownik = uzytkownik;
	}

    @Override
	public String dajImie() {
		return _uzytkownik.dajImie();
	}

    @Override
	public String dajNazwisko() {
		return _uzytkownik.dajNazwisko();
	}

    @Override
	public String dajPoczteElektroniczna() {
		return _uzytkownik.dajPoczteElektroniczna();
	}

	@Override
	public int dajNr(){
		return _uzytkownik.dajNr();
	}

    @Override
	public String opisz() {
		return _uzytkownik.opisz();
	}
}