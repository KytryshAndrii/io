package Kontroler;

import Model.IModel;

import java.util.Scanner;

public class TworzenieGrupyZajeciowej extends StrategiaZarzadzaniaGrupaZajeciowa {

	public TworzenieGrupyZajeciowej(IModel Model) {
		super(Model);
	}
	/**
	 * PU05 Tworzenie grupy zajeciowej.
	 * @return int jako numer poprawnie utworzonej grupy zajeciowej.
	 */
	private void wprowadzenieDanychGrupy() {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Podaj numer grupy: ");
			int nrGrupy = scanner.nextInt();

			System.out.print("Podaj ilość miejsc: ");
			int iloscMiejsc = scanner.nextInt();

			scanner.nextLine();

			System.out.print("Podaj kierunek: ");
			String kierunek = scanner.nextLine();

			System.out.print("Podaj opis grupy: ");
			String opis = scanner.nextLine();

			String daneGrupy = nrGrupy + ";" + iloscMiejsc + ";" + kierunek + ";" + opis;

			_model.tworzenieGrupyZajeciowej(daneGrupy);

			PrzekazanieInformacjiUzytkownikowi.przekazanieInformacji(
					"Grupa zajęciowa została poprawnie utworzona."
			);

		} catch (Exception e) {
			PrzekazanieInformacjiUzytkownikowi.przekazanieInformacji(
					"Błąd podczas tworzenia grupy: " + e.getMessage()
			);
			throw e;
		}
	}
	@Override
	public boolean zakonczenieZarzadzaniaGrupa() {
		try {
			wprowadzenieDanychGrupy();
			return true;
		} catch (Exception e) {
			PrzekazanieInformacjiUzytkownikowi.przekazanieInformacji(e.getMessage());
			return false;
		}
	}
}