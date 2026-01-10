package Kontroler;

import Model.IModel;

import java.util.Scanner;

public class EdycjaRejestracjiStudenta {
	private IModel _model;
	private IPrzegladanieGrup _przegladanieGrupy;
	private StrategiaEdycjiRejestracjiStudenta _strategiaEdycjiRejestracjiStudenta;

	public EdycjaRejestracjiStudenta(IModel Model) {
		this._model = Model;
		this._przegladanieGrupy = new PrzegladanieGrup(Model);
	}

	/**
	 * PU02 Edycia rejestracji studenta.
	 * @return void w razie powodzeia. W przeciwnym razie, uzytkownikowi wyswietla sie komunikat.
	 */
	public void wyborOpcji() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Podaj numer studenta: ");
		int nrStudenta = scanner.nextInt();

		this._przegladanieGrupy.wyswietlenieDanychOGrupach(nrStudenta);


		System.out.println("Wybierz operację:");
		System.out.println("1 - Rejestracja do grupy");
		System.out.println("2 - Wyrejestrowanie z grupy");
		int wybor = scanner.nextInt();

		System.out.print("Podaj numer grupy: ");
		int nrGrupy = scanner.nextInt();

		switch (wybor) {
			case 1 -> _strategiaEdycjiRejestracjiStudenta = new RejestracjaDoGrupy(this._model);
			case 2 -> _strategiaEdycjiRejestracjiStudenta = new WyrejestrowanieZGrupy(this._model);
			default -> {
				System.out.println("Nieprawidłowy wybór.");
				return;
			}
		}

		this._strategiaEdycjiRejestracjiStudenta.ustawDane(nrGrupy, nrStudenta);
		boolean sukces = _strategiaEdycjiRejestracjiStudenta.ukonczEdycje();

		if (sukces) {
			System.out.println("Operacja zakończona sukcesem.");
		} else {
			System.out.println("Operacja nie powiodła się.");
		}
	}
}