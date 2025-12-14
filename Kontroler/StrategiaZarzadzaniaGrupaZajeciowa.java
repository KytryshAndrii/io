package Kontroler;

import Model.IModel;

public abstract class StrategiaZarzadzaniaGrupaZajeciowa {
	protected IModel _model;
	protected int _nrGrupy;

	public int zakonczenieZarzadzaniaGrupa(int aNrGrupy) {
		throw new UnsupportedOperationException();
	}
}