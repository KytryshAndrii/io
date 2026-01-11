package Kontroler;

import Model.IModel;

import java.util.ArrayList;
import java.util.List;

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

	public void wyswietlenieDanychOWszystkichGrupach(){
		String[] grupy = this._model.dajDaneWszystkichGrup();
        for (String grupa : grupy) {
            System.out.println(wyswietlenieDanychOGrupie(grupa));
        }
	}

	public String[] wyswietlenieDanychOGrupach(int NrStudenta){
		String[] dostepneGrupy = this._model.znalezienieDostepnychGrupZajeciowych(NrStudenta);
		List<String> znormalizowaneDaneOGrupach =
				new ArrayList<>();
		for (int i = 0; i < dostepneGrupy.length; i++) {
			znormalizowaneDaneOGrupach.add(
					wyswietlenieDanychOGrupie(dostepneGrupy[i]));
			System.out.println(wyswietlenieDanychOGrupie(dostepneGrupy[i]));
		}
		String[] daneGrup = znormalizowaneDaneOGrupach.toArray(new String[0]);
		return daneGrup;
	}
}