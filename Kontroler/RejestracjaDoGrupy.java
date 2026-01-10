package Kontroler;

import Model.IModel;


public class RejestracjaDoGrupy extends StrategiaEdycjiRejestracjiStudenta {

	public RejestracjaDoGrupy(IModel model) {
		super(model);
	}

	/**
	 * PU01 Rejestracja do grupy.
	 * Jesli rejestracja się powiedzie żadny wątek nie zostanie wywołany.
	 */
	public void przypisanieDoGrupy(int NrGrupy, int NrStudenta) {
		if (this._model.czyGrupaZajeciowaJestPelna(NrGrupy)) {
			throw new IllegalStateException("Grupa zajęciowa jest pełna");
		}
		if (this._model.czyStudentJestWGrupie(NrStudenta, NrGrupy)) {
			throw new IllegalStateException("Student obecnie znajduje się w grupie");
		}
		this._model.rejestracjaStudenta(NrStudenta, NrGrupy);
		this._model.zarejestrowanieZdarzenia(
				"Student nr " + NrStudenta + " zapisany do grupy nr " + NrGrupy
		);
	}

	@Override
	public boolean ukonczEdycje() {
		try {
			przypisanieDoGrupy(this._nrGrupy, this._nrStudenta);
			return true;
		} catch (Exception e) {
			PrzekazanieInformacjiUzytkownikowi.przekazanieInformacji(e.getMessage());
			return false;
		}
	}
}