package Kontroler;

import Model.IModel;

public class EdycjaRejestracjiStudenta {
	private IModel _model;
	private IPrzegladanieGrup _przegladanieGrupy;
	private StrategiaEdycjiRejestracjiStudenta _strategiaEdycjiRejestracjiStudenta;

	public EdycjaRejestracjiStudenta(IModel Model) {
		this._model = Model;
	}

	/**
	 * PU02 Edycia rejestracji studenta.
	 * @return void w razie powodzeia. W przeciwnym razie, uzytkownikowi wyswietla sie komunikat.
	 */
	private void wyborOpcji() {
		throw new UnsupportedOperationException();
	}
}