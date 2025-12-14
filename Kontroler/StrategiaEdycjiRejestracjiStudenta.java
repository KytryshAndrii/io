package Kontroler;

import Model.IModel;

public abstract class StrategiaEdycjiRejestracjiStudenta {
	protected IModel _model;
	protected int _nrGrupy;
	protected int _nrStudenta;

	public int wyborGrupy(int aNrStudenta) {
		throw new UnsupportedOperationException();
	}
}