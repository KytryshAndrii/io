package Kontroler;

import Model.IModel;

public class KontrolerStudenta implements IKontrolerStudenta {
	private IModel _model;

	public KontrolerStudenta(IModel Model) {
		this._model = Model;
	}

	public void rejestracjaDoGrupy() {
		RejestracjaDoGrupy encjaRejestracji = new RejestracjaDoGrupy(this._model);
		encjaRejestracji.ukonczEdycje();
	}

	public void edycjaRejestracjiStudenta() {
		EdycjaRejestracjiStudenta encjaEdycjiRejestracjiStudenta = new EdycjaRejestracjiStudenta(this._model);
		encjaEdycjiRejestracjiStudenta.wyborOpcji();
	}
}