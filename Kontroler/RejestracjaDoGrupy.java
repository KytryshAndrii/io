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
	public void przypisanieDoGrupy() {
		boolean czyGrupaPelna = this._model.czyGrupaZajeciowaJestPelna(this._nrGrupy);
		if (czyGrupaPelna) {
			throw new IllegalStateException("Grupa zajęciowa jest pełna");
		}
		boolean czyStudentJestWGrupie = this._model.czyStudentJestWGrupie(this._nrStudenta, this._nrGrupy);
		if (czyStudentJestWGrupie) {
			throw new IllegalStateException("Student obecnie znajduje się w grupie");
		}
		this._model.rejestracjaStudenta(this._nrStudenta, this._nrGrupy);
		this._model.zarejestrowanieZdarzenia(
				"Student nr " + this._nrStudenta + " zapisany do grupy nr " + this._nrGrupy
		);
	}

	@Override
	public boolean ukonczEdycje() {
		try {
			przypisanieDoGrupy();
			return true;
		} catch (Exception e) {
			PrzekazanieInformacjiUzytkownikowi.przekazanieInformacji(e.getMessage());
			return false;
		}
	}
}