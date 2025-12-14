package Kontroler;

import Model.IModel;

public class RejestracjaDoGrupy extends StrategiaEdycjiRejestracjiStudenta {

	private final IModel model;

	public RejestracjaDoGrupy(IModel model) {
		this.model = model;
	}

	/**
	 * PU01 Rejestracja do grupy.
	 * @return true jeśli (w przyszłości) rejestracja się powiedzie.
	 */
	public boolean przypisanieDoGrupy(int NrGrupy, int NrStudenta) {
		throw new UnsupportedOperationException("przypisanieDoGrupy() niezaimplementowana");
		// albo: return false;
	}
}