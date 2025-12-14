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

    @Override
	public String dajImie() {
		return _imie;
	}

    @Override
	public String dajNazwisko() {
		return _nazwisko;
	}

    @Override
	public String dajPoczteElektroniczna() {
		return _pocztaElektroniczna;
	}

    @Override
	public String opisz() {
		return "Administrator: " + _imie + " " + _nazwisko +  ", email:  " + _pocztaElektroniczna;
	}
}