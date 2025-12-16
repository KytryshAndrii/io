package Model;

public class FabrykaAdministratora implements IFabrykaUzytkownika {

	public FabrykaAdministratora() {}

	@Override
	public IUzytkownik utworzUzytkownika(String[] aDane) {

		if (aDane == null || aDane.length < 4) {
			throw new IllegalArgumentException(
					"Niepoprawne dane do utworzenia administratora"
			);
		}

		int nr = Integer.parseInt(aDane[0]);
		String imie = aDane[1];
		String nazwisko = aDane[2];
		String email = aDane[3];

		return new Administrator(nr, imie, nazwisko, email);
	}
}
