package Kontroler;

import Model.IModel;

public class PrzegladanieGrup implements IPrzegladanieGrup {
	private IModel _model;

	public PrzegladanieGrup(IModel Model) {
		this._model = Model;
	}
	/**
	 * PU08 Przegladanie danych o grupach.
	 * @return dane o grupach w postaci ciagu znakow string
	 */
	public String wyswietlenieDanychOGrupie(int NrStudenta) {
		throw new UnsupportedOperationException();
	}
}