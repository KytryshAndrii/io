package Kontroler;

import Model.IModel;

import java.util.Scanner;

public class ZarzadzanieGrupaZajeciowa {
	private IModel _model;
	private IPrzegladanieGrup _przegladanieGrupy;
	private StrategiaZarzadzaniaGrupaZajeciowa _strategiaZarzadzaniaGrupaZajeciowa;

	public ZarzadzanieGrupaZajeciowa(IModel Model) {
		this._model = Model;
		this._przegladanieGrupy = new PrzegladanieGrup(Model);
	}
	/**
	 * PU04 Zarzadzanie grupa zajeciowa.
	 * @return  void w razie powodzeia. W przeciwnym razie, uzytkownikowi wyswietla sie komunikat.
	 */
	public void wyborOpcji() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Wybierz operację zarządzania grupą zajęciową:");
		System.out.println("1 - Tworzenie nowej grupy");
		System.out.println("2 - Usunięcie istniejącej grupy");
		System.out.println("3 - Zmiana limitu miejsc w grupie");

		int wybor = scanner.nextInt();
		scanner.nextLine();

		Integer numerGrupy = null;
		if (wybor == 2 || wybor == 3) {
			System.out.println("Lista dostępnych grup:");
			this._przegladanieGrupy.wyswietlenieDanychOWszystkichGrupach();
			System.out.print("Podaj numer grupy: ");
			numerGrupy = scanner.nextInt();
			scanner.nextLine();
		}

		switch (wybor) {
			case 1:
				this._strategiaZarzadzaniaGrupaZajeciowa = new TworzenieGrupyZajeciowej(this._model);
				break;
			case 2:
				this._strategiaZarzadzaniaGrupaZajeciowa = new UsuwanieGrupZajeciowych(this._model);
				break;
			case 3:
				this._strategiaZarzadzaniaGrupaZajeciowa = new ZmianaLimituMiejsc(this._model);
				break;
			default:
				return;
		}

		this._strategiaZarzadzaniaGrupaZajeciowa.ustawDane(numerGrupy);
		boolean sukces = this._strategiaZarzadzaniaGrupaZajeciowa.zakonczenieZarzadzaniaGrupa();

		if (sukces) {
			System.out.println("Operacja zakończona sukcesem.");
		} else {
			System.out.println("Operacja nie powiodła się.");
		}
	}
}