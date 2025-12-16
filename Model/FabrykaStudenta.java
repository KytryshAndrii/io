package Model;

public class FabrykaStudenta implements IFabrykaUzytkownika {

	public FabrykaStudenta() {
	}

	@Override
	public IUzytkownik utworzUzytkownika(String[] aDane) {

		if (aDane == null || aDane.length < 6) {
			throw new IllegalArgumentException(
					"Niepoprawne dane do utworzenia studenta"
			);
		}

		int nr = Integer.parseInt(aDane[0]);
		String imie = aDane[1];
		String nazwisko = aDane[2];
		String email = aDane[3];
		int nrStudenta = Integer.parseInt(aDane[4]);
		String kierunek = aDane[5];

		IUzytkownik uzytkownik =
				new Administrator(nr, imie, nazwisko, email);

		return new Student(nrStudenta, kierunek, uzytkownik);
	}
}
