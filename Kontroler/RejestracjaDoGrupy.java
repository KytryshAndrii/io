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
	public boolean przypisanieDoGrupy(int NrGrupy, int NrStudenta) {
//		check if group exists and if group is not full. If not , add user to group if yes show error
		try {
			this.model.weryfikacjaGrupyZajeciowej(NrStudenta, NrGrupy);
		}
		catch(Exception e) {
			throw new ArrayIndexOutOfBoundsException("Grupa zajeciowa nie znaleziona");
		}
		// albo: return false;
	}
}