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
	private String wyswietlenieDanychOGrupie(String daneOGrupie) {
//		TODO: implement showing in console logic
		return "";
	}

	public String[] wyswietlenieDanychOGrupach(int NrStudenta){
		String[] dostepneGrupy = _model.znalezienieDostepnychGrupZajeciowych(NrStudenta);
		String[] znormalizowaneDaneOGrupach =
				new String[dostepneGrupy.length];
		for (int i = 0; i < dostepneGrupy.length; i++) {
			znormalizowaneDaneOGrupach[i] =
					wyswietlenieDanychOGrupie(dostepneGrupy[i]);
		}
		return znormalizowaneDaneOGrupach;
	}
}