package Kontroler;

import Model.IModel;

public class ZmianaLimituMiejsc extends StrategiaZarzadzaniaGrupaZajeciowa {

	public ZmianaLimituMiejsc(IModel Model) {
		super(Model);
	}

	/**
	 * PU07 Zmiana limitu miejsc w grupie.
	 */
	private void wprowadzenieNowegoLimituMiejsc() {
		return;
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