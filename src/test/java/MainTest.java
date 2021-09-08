import com.company.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void proofLengthTest() {
        //GIVEN
        String s = "qqqqqqqqqqqqqqqqqqqq"; // 20 Zeichen
        //CHECK
        boolean check = Main.proofLength(s);
        //EXP.
        Assertions.assertFalse(check);
    }

    @Test
    public void proofIsEqualTest(){
        //GIVEN
        String s = "qqqqfancyqqq";
        //CHECK
        boolean check = Main.proofFancy(s);
        //EXP.
        Assertions.assertTrue(check);
    }
}
