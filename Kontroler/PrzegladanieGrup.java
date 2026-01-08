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
		String[] pola = daneOGrupie.split(";", 5);

		String nrGrupy = pola[0];
		String iloscMiejsc = pola[1];
		String studenty = pola[2];
		String kierunek = pola[3];
		String opisGrupy = pola[4];

		return String.format(
				"""
                📘 Grupa nr %s
                📍 Kierunek: %s
                👥 Studenci zapisani: %s
                🔢 Dostępnych miejsc: %s
                📝 Opis: %s
                """,
				nrGrupy, kierunek, studenty, iloscMiejsc, opisGrupy
		);
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