package Kontroler;

import Model.IModel;

public class KontrolerStudenta implements IKontrolerStudenta {
	private IModel _model;

	public KontrolerStudenta(IModel Model) {
		this._model = Model;
	}

	public void rejestracjaDoGrupy() {
		throw new UnsupportedOperationException("rejestracjaDoGrupy() w Kontroler.KontrolerStudenta niezaimplementowana");
	}

	public void edycjaRejestracjiStudenta() {
		throw new UnsupportedOperationException("edycjaRejestracjiStudenta() w Kontroler.KontrolerStudenta niezaimplementowana");
	}
}