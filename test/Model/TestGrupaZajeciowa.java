// test.Model.TestGrupaZajeciowa.java

package test.Model;

import Model.GrupaZajeciowa;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(OrderAnnotation.class)
@DisplayName("Testy jednostkowe dla klasy GrupaZajeciowa")
public class TestGrupaZajeciowa {

    private GrupaZajeciowa grupa;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Rozpoczęcie zestawu testów klasy GrupaZajeciowa");
    }

    @BeforeEach
    void setUp() {
        // jeśli
        grupa = new GrupaZajeciowa(5, new int[]{1,2}, "INF", "Testowa grupa", 100);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test zakończony");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Zakończono zestaw testów");
    }

    @Test
    @Order(1)
    @DisplayName("Czy numer grupy jest poprawny")
    void testDajNrGrupy() {
        // gdy
        int nr = grupa.dajNrGrupy();

        // wtedy
        assertEquals(100, nr);
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 0})
    @Order(2)
    @DisplayName("Czy ilość miejsc jest poprawna dla różnych wartości")
    void testIloscMiejsc(int ilosc) {
        GrupaZajeciowa g = new GrupaZajeciowa(ilosc, new int[0], "INF", "opis", 1);
        assertTrue(g.dajIloscMiejsc() >= 0);
    }

    @ParameterizedTest
    @CsvSource({
            "INF, INF",
            "BIO, BIO"
    })
    @Order(3)
    @DisplayName("Czy kierunek jest ustawiany poprawnie")
    void testKierunek(String input, String expected) {
        GrupaZajeciowa g = new GrupaZajeciowa(1, new int[0], input, "opis", 2);
        assertEquals(expected, g.dajKierunek());
    }

    @Test
    @Order(4)
    @DisplayName("Czy tablica studentów nie jest null")
    void testStudenciNotNull() {
        assertNotNull(grupa.dajStudentow());
    }

    @Test
    @Order(5)
    @DisplayName("Czy metoda opisz() zawiera numer grupy")
    void testOpisz() {
        String opis = grupa.opisz();
        assertTrue(opis.contains("100"));
    }

    @Test
    @Order(6)
    @DisplayName("Czy metoda opisz() nie rzuca wyjątku przy null studentach")
    void testOpiszNullSafe() {
        GrupaZajeciowa g = new GrupaZajeciowa(3, null, "INF", "brak", 4);
        assertDoesNotThrow(g::opisz);
    }
}
