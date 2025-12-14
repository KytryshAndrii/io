package Model;

public class Administrator implements  IUzytkownik{

	private int _nr;
	private String _imie;
	private String _nazwisko;
	private String _pocztaElektroniczna;

	public Administrator(int nr, String imie, String nazwisko, String pocztaElektroniczna) {
		this._nr = nr;
		this._imie = imie;
		this._nazwisko= nazwisko;
		this._pocztaElektroniczna = pocztaElektroniczna;
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