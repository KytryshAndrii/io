package Kontroler;

import Model.IModel;

public abstract class StrategiaZarzadzaniaGrupaZajeciowa {
	protected IModel _model;
	protected int _nrGrupy;
	protected  int _nowyLimitMiejsc;

	public StrategiaZarzadzaniaGrupaZajeciowa(IModel model) {
		this._model = model;
	}

	public abstract boolean zakonczenieZarzadzaniaGrupa();
}