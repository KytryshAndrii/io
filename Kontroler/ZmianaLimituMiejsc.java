package Kontroler;

import Model.IModel;

public class ZmianaLimituMiejsc extends StrategiaZarzadzaniaGrupaZajeciowa {

	public ZmianaLimituMiejsc(IModel Model) {
		super(Model);
	}

	/**
	 * PU07 Zmiana limitu miejsc w grupie.
	 * @return int jako numer wybranej grupy z poprawnie zmienionym limitem miejsc.
	 */
	private int wprowadzenieNowegoLimituMiejsc() {
		throw new UnsupportedOperationException();
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