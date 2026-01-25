package Kontroler;

import Model.IModel;

public class KontrolerAdministratora implements IKontrolerAdministratora {
	private IModel _model;

	public KontrolerAdministratora(IModel model) {
		this._model = model;
	}

	public void zarzadzanieGrupeZajeciowa() {
		ZarzadzanieGrupaZajeciowa encjaZarzadzaniaGrupaZajeciowa = new ZarzadzanieGrupaZajeciowa(this._model);
		encjaZarzadzaniaGrupaZajeciowa.wyborOpcji();
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