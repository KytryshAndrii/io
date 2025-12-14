package Model;

public class Student extends Uzytkownik {
	private int _nrStudenta;
	private String _kierunek;

	public Student(int nrStudenta, String Kierunek, IUzytkownik uzytkownik) {
		super(uzytkownik);
        this._nrStudenta = nrStudenta;
		this._kierunek = Kierunek;
	}

	public int dajNrStudenta() {
		throw new UnsupportedOperationException();
	}

	public String dajKierunek() {
		throw new UnsupportedOperationException();
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