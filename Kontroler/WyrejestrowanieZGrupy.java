package Kontroler;

import Model.IModel;

public class WyrejestrowanieZGrupy extends StrategiaEdycjiRejestracjiStudenta {

	private final IModel model;

	public WyrejestrowanieZGrupy(IModel model) {
		this.model = model;
	}
	/**
	 * PU03 Wyrejestrowanie z grupy.
	 * @return true jeśli  proces wyrejestrowania się powiedzie.
	 */
	public boolean wypisanieZGrupy(int NrGrupy, int NrStudenta) {
		boolean sukces = model.wyrejestrowanieStudenta(NrStudenta, NrGrupy);

		if (sukces) {
			potwierdzenieWyrejestrowania(NrStudenta, NrGrupy);
			return true;
		} else {
			PrzekazanieInformacjiUzytkownikowi
					.przekazanieInformacji("Nie udało się wypisać studenta z grupy.");
			return false;
		}
	}

	private boolean potwierdzenieWyrejestrowania(int NrStudenta, int NrGrupy) {
		PrzekazanieInformacjiUzytkownikowi
				.przekazanieInformacji("Student o numerze " + NrStudenta + " został wypisany z grupy " + NrGrupy + "pomyślnie .");
		return true;
	}
}