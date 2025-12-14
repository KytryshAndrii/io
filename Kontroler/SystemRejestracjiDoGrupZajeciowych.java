package Kontroler;

import Model.*;

public class SystemRejestracjiDoGrupZajeciowych {

	public static void main(String[] args) {


		IDAO dao = new DAO();                         // warstwa dostępu do danych
		KontekstSystemu kontekst = new KontekstSystemu(dao);
		IModel model = new Model(kontekst, dao);      // fasada modelu


//		IUzytkownik student = new Student(1, 12345,  "Inf");
//		IUzytkownik admin   = new Administrator(100);

		IGrupaZajeciowa grupa1 = new GrupaZajeciowa(1, new int[] {1}, "Inf", "Grupa 10", 10);


		IKontrolerStudenta kontrolerStudenta =
				new KontrolerStudenta(model);
		IKontrolerAdministratora kontrolerAdministratora =
				new KontrolerAdministratora(model);

		WyrejestrowanieZGrupy wyrejestrowanieZGrupy =
				new WyrejestrowanieZGrupy(model);
		PrzegladanieGrup przegladanieGrup =
				new PrzegladanieGrup(model);


//		System.out.println("=== TEST: Otrzymanie danych o zadanej grupie ===");
//		try {
//					kontekst.dajGrupe(22);
//		} catch (UnsupportedOperationException ex) {
//			System.out.println("Operacja rejestracji niezaimplementowana: "
//					+ ex.getMessage());
//		}
//		System.out.println("=== TEST: Dodanie studenta do grupy ===");
//		try {
//			kontekst.dodajStudentaDoGrupy(1, 1);
//		} catch (UnsupportedOperationException ex) {
//			System.out.println("Operacja rejestracji niezaimplementowana: "
//					+ ex.getMessage());
//		}
//
//		System.out.println("=== TEST: Pobranie danych administratora ===");
//		try {
//			kontekst.dajAdministratora(100);
//		} catch (UnsupportedOperationException ex) {
//			System.out.println("Operacja rejestracji niezaimplementowana: "
//					+ ex.getMessage());
//		}


		System.out.println("=== TEST  PU01: Rejestracja studenta do grupy ===");
		try {
			kontrolerStudenta.rejestracjaDoGrupy();
		} catch (UnsupportedOperationException ex) {
			System.out.println("Operacja rejestracji niezaimplementowana: "
					+ ex.getMessage());
		}

		System.out.println("=== TEST PU02: Edycja rejestracji studenta ===");
		try {
			kontrolerStudenta.edycjaRejestracjiStudenta();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

//		System.out.println("=== TEST  PU03: Wyrejestrowanie studenta z grupy ===");
//		try {
//			boolean wynik = wyrejestrowanieZGrupy.wypisanieZGrupy(
//					/* nrGrupy */ 1,
//					/* nrStudenta */ 12345
//			);
//			System.out.println("Wynik wyrejestrowania: " + wynik);
//		} catch (UnsupportedOperationException ex) {
//			System.out.println("Operacja wyrejestrowania niezaimplementowana: "
//					+ ex.getMessage());
//		}

		System.out.println("=== TEST PU04: Zarządzanie grupą zajęciową ===");
		try {
			kontrolerAdministratora.zarzadzanieGrupeZajeciowa();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


//		System.out.println("=== TEST  PU08: Przeglądanie grup ===");
//		try {
//			String opisGrup = przegladanieGrup.wyswietlenieDanychOGrupie(
//					/* nrStudenta */ 12345
//			);
//			System.out.println(opisGrup);
//		} catch (UnsupportedOperationException ex) {
//			System.out.println("Operacja przeglądania grup niezaimplementowana: "
//					+ ex.getMessage());
//		}

		System.out.println("=== KONIEC TESTU SYSTEMU ===");
	}
}
