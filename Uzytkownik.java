public abstract class Uzytkownik implements IUzytkownik {
	protected int _nr;
	private String _imie;
	private String _nazwisko;
	private String _pocztaElektroniczna;
	protected int _nrStudenta;
	protected String _kierunek;

	public String dajImie() {
		throw new UnsupportedOperationException();
	}

	public String dajNazwisko() {
		throw new UnsupportedOperationException();
	}

	public String dajPoczteElektroniczna() {
		throw new UnsupportedOperationException();
	}
}