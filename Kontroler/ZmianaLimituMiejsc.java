package Kontroler;

import Model.IModel;

import java.util.Scanner;

public class ZmianaLimituMiejsc extends StrategiaZarzadzaniaGrupaZajeciowa {

	public ZmianaLimituMiejsc(IModel Model) {
		super(Model);
	}

	/**
	 * PU07 Zmiana limitu miejsc w grupie.
	 */
	private void wprowadzenieNowegoLimituMiejsc() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Podaj nowy limit miejsc: ");
		int nowyLimit = scanner.nextInt();

		if (nowyLimit < 0) {
			throw new IllegalArgumentException("Limit miejsc nie może być ujemny.");
		}

		this._model.zmienLimitMiejscWGrupie(_nrGrupy, nowyLimit);
		this._model.zarejestrowanieZdarzenia("Zmieniono limit miejsc w grupie nr " + _nrGrupy + " na " + nowyLimit);
		PrzekazanieInformacjiUzytkownikowi.przekazanieInformacji("Limit miejsc w grupie został zmieniony.");
	}

	@Override
	public boolean zakonczenieZarzadzaniaGrupa() {
		try {
			this.wprowadzenieNowegoLimituMiejsc();
			return true;
		} catch (Exception e) {
			PrzekazanieInformacjiUzytkownikowi.przekazanieInformacji(e.getMessage());
			return false;
		}
	}
}