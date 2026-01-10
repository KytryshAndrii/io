package Kontroler;

import Model.IModel;

public abstract class StrategiaZarzadzaniaGrupaZajeciowa {
	protected IModel _model;
	protected int _nrGrupy;

	public StrategiaZarzadzaniaGrupaZajeciowa(IModel model) {
		this._model = model;
	}

	public abstract boolean zakonczenieZarzadzaniaGrupa();
}