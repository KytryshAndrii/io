package Kontroler;

import Model.IModel;

public class UsuwanieGrupZajeciowych extends StrategiaZarzadzaniaGrupaZajeciowa {

	public UsuwanieGrupZajeciowych(IModel Model) {
		super(Model);
	}

	/**
	 * PU06 Usuwanie Grup zajeciowych.
	 * @return int jako numer wybranej grupy do usuniecia.
	 */
	private int wyborGrupyDoUsuniecia() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean zakonczenieZarzadzaniaGrupa() {
		try {
			this.wyborGrupyDoUsuniecia();
			return true;
		} catch (Exception e) {
			PrzekazanieInformacjiUzytkownikowi.przekazanieInformacji(e.getMessage());
			return false;
		}
	}
}