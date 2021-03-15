import com.engeto.Kalkulacka;
import com.engeto.Vyraz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KalkulackaTest {

    Kalkulacka kalkulacka = new Kalkulacka();

    @Test
    public void prvniTest(){
        String vstup = "5 + 3";
        String vystup = "8";

        Assertions.assertEquals(vystup, kalkulacka.vypocet(vstup));
    }

    @Test
    public void nasobeniTest(){
        String vstup = "2 * 5";
        String vystup = "10";

        Assertions.assertEquals(vystup, kalkulacka.vypocet(vstup));
    }

    @Test
    public void scitaniDoubleTest(){
        String vstup = "2.5 * 3";
        String vystup = "7.5";

        Assertions.assertEquals(vystup, kalkulacka.vypocet(vstup));
    }

    @Test
    public void rozdeleniNaVyrazTest(){
        String vstup = "2.5 * 3";
        Vyraz vyraz = new Vyraz("2.5", "*", "3");

        Assertions.assertEquals(vyraz, kalkulacka.rozdelitNaVyraz(vstup));
    }

    @Test
    public void nasobeniVnitrniTest(){
        Double a = 2.5;
        Double b = 3.0;

        Double vysledek = 7.5;

        Assertions.assertEquals(vysledek, kalkulacka.nasobeni(a, b));
    }

}
