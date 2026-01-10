package Kontroler;

import Model.IModel;

public abstract class StrategiaZarzadzaniaGrupaZajeciowa {
	protected IModel _model;
	protected int _nrGrupy;

	public StrategiaZarzadzaniaGrupaZajeciowa(IModel model) {
		this._model = model;
	}

	public final void ustawDane(int nrGrupy) {
		this._nrGrupy = nrGrupy;
	}

	public abstract boolean zakonczenieZarzadzaniaGrupa();
}