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
		throw new UnsupportedOperationException(" wypisanieZGrupy() niezaimplementowana");
	}

	private boolean potwierdzenieWyrejestrowania(int NrStudenta) {
		throw new UnsupportedOperationException("potwierdzenieWyrejestrowania() niezaimplementowana");
	}
}