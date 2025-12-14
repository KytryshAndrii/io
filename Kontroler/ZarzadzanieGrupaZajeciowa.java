package Kontroler;

import Model.IModel;

public class ZarzadzanieGrupaZajeciowa {
	private IModel _model;
	private StrategiaZarzadzaniaGrupaZajeciowa _strategiaZarzadzaniaGrupaZajeciowa;

	public ZarzadzanieGrupaZajeciowa(IModel Model) {
		this._model = Model;
	}
	/**
	 * PU04 Zarzadzanie grupa zajeciowa.
	 * @return  void w razie powodzeia. W przeciwnym razie, uzytkownikowi wyswietla sie komunikat.
	 */
	public void wyborOpcji() {
		throw new UnsupportedOperationException("wyborOpcji() niezaimplementowana");
	}
}