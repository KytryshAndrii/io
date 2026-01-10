package Kontroler;

import Model.IModel;

public class UsuwanieGrupZajeciowych extends StrategiaZarzadzaniaGrupaZajeciowa {

	public UsuwanieGrupZajeciowych(IModel Model) {
		super(Model);
	}

	/**
	 * PU06 Usuwanie Grup zajęciowych.
	 * Sprawdza czy grupa jest pusta – jeśli tak, usuwa ją i rejestruje zdarzenie.
	 * W przeciwnym razie informuje o błędzie.
	 */
	private void wyborGrupyDoUsuniecia() {
		boolean czyPelna = this._model.czyGrupaZajeciowaJestPelna(this._nrGrupy);

		if (czyPelna) {
			PrzekazanieInformacjiUzytkownikowi.przekazanieInformacji("Grupa jest pełna! Nie może być usunięta!");
			throw new IllegalStateException("Grupa nie jest pusta – nie można jej usunąć.");
		}

		this._model.usuniecieGrupyZajeciowej(this._nrGrupy);
		this._model.zarejestrowanieZdarzenia("Grupa o numerze " + this._nrGrupy + " została usunięta.");
		PrzekazanieInformacjiUzytkownikowi.przekazanieInformacji("Grupa została pomyślnie usunięta.");
	}


	@Override
	public boolean zakonczenieZarzadzaniaGrupa() {
		try {
			this.wyborGrupyDoUsuniecia();
			return true;
		} catch (Exception e) {
			PrzekazanieInformacjiUzytkownikowi.przekazanieInformacji(e.getMessage());
			return false;
		}
	}
}