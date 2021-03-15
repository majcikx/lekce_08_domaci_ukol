import com.engeto.Main;
import org.junit.jupiter.api.*;

public class PrvniUnitTest {

    static Main main;

    @BeforeEach
    public void inicialize() {
        System.out.println("BeforeEach");
        main = new Main();
    }

    @BeforeAll
    public static void inicialize2() {
        System.out.println("BeforeAll init Main");
        //main = new Main();
    }

    @Test
    public void prvniTest() {
        System.out.println("Test funguje");
    }

    @Test
    public void testSoucetTest() {
        Integer vysledek = main.soucet(2, 5);
        Assertions.assertEquals(7, vysledek);
    }

    @Test
    public void testSoucetSpatneTest() {
        Integer vysledek = main.soucetPlusJedna(2, 5);
        Assertions.assertEquals(8, vysledek);
    }

    @Test
    public void testSoucetSpatne2Test() {
        Integer vysledek = main.soucetPlusJedna(2, 5);
        Assertions.assertEquals(8, vysledek);
    }

    @Test
    public void testSoucetViceTestuTest() {
        Assertions.assertEquals(7, main.soucet(2, 5));
        Assertions.assertEquals(7, main.soucet(1, 0));
        Assertions.assertEquals(7, main.soucet(1, 1));
        Assertions.assertEquals(7, main.soucet(1, 6));
        Assertions.assertEquals(5, main.soucet(0, 5));
        Assertions.assertEquals(0, main.soucet(0, 0));
    }

    @Test
    public void testSoucetViceTestuVsechnyTest() {
        Assertions.assertAll("soucet",
                () -> Assertions.assertEquals(7, main.soucet(2, 5)),
                () -> Assertions.assertEquals(7, main.soucet(1, 0)),
                () -> Assertions.assertEquals(7, main.soucet(1, 1)),
                () -> Assertions.assertEquals(7, main.soucet(1, 6)),
                () -> Assertions.assertEquals(7, main.soucet(0, 5)),
                () -> Assertions.assertEquals(0, main.soucet(0, 0))
        );
    }

    @Test
    public void testNacteniZeSouboruTest() throws Exception {
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            main.nacteniZeSouboru();
        });
        Assertions.assertEquals("Chyba", exception.getMessage());
        System.out.println("Vyjimka ocekavana");

    }
}
