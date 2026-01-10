package Kontroler;

import Model.IModel;

public abstract class StrategiaEdycjiRejestracjiStudenta {
	protected IModel _model;
	protected int _nrGrupy;
	protected int _nrStudenta;

	public StrategiaEdycjiRejestracjiStudenta(IModel model) {
		this._model = model;
	}

	public final void ustawDane(int nrGrupy, int nrStudenta) {
		this._nrGrupy = nrGrupy;
		this._nrStudenta = nrStudenta;
	}

	public abstract boolean ukonczEdycje();
}
