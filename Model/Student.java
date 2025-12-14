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
		return _nrStudenta;
	}

	public String dajKierunek() {
		return _kierunek;
	}

	public String opisz() {
		return super.opisz() + ", Student [nr: " + _nrStudenta + ", kierunek: " + _kierunek + "]";
	}
}