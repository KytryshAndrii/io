package Model;

public abstract class Uzytkownik implements IUzytkownik {
	protected IUzytkownik _uzytkownik;

	public Uzytkownik(IUzytkownik uzytkownik) {
//        throw new UnsupportedOperationException();
	}

	public String dajImie() {
		throw new UnsupportedOperationException();
	}

	public String dajNazwisko() {
		throw new UnsupportedOperationException();
	}

	public String dajPoczteElektroniczna() {
		throw new UnsupportedOperationException();
	}

	public String opisz() {
		throw new UnsupportedOperationException();
	}

}