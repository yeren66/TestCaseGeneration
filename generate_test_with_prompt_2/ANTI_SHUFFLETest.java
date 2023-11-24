package humaneval;
import static org.junit.Assert.*;
import org.junit.Test;

public class ANTI_SHUFFLETest {
    @Test
    public void humaneval.correct.ANTI_SHUFFLE.anti_shuffle() {
        String result = humaneval.correct.ANTI_SHUFFLE.anti_shuffle("Hello World!!!");
        assertEquals("Hello !!!Wdlor", result);
    }
}