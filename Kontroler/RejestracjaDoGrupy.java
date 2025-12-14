package Kontroler;

import Model.IModel;

import java.util.Arrays;

public class RejestracjaDoGrupy extends StrategiaEdycjiRejestracjiStudenta {

	private final IModel model;

	public RejestracjaDoGrupy(IModel model) {
		this.model = model;
	}

	/**
	 * PU01 Rejestracja do grupy.
	 * @return true jeśli (w przyszłości) rejestracja się powiedzie.
	 */
	public void przypisanieDoGrupy(int NrGrupy, int NrStudenta) {
		if (this.model.czyGrupaZajeciowaJestPelna(NrGrupy)) {
			throw new IllegalStateException("Grupa zajęciowa jest pełna");
		}
		if (this.model.czyStudentJestWGrupie(NrStudenta, NrGrupy)) {
			throw new IllegalStateException("Student obecnie znajduje się w grupie");
		}
		this.model.rejestracjaStudenta(NrStudenta, NrGrupy);
		this.model.zarejestrowanieZdarzenia(
				"Student nr " + NrStudenta + " zapisany do grupy nr " + NrGrupy
		);
	}
}