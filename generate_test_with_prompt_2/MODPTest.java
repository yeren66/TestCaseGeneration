package humaneval;
import static org.junit.Assert.*;
import org.junit.Test;

public class MODPTest {
    @Test
    public void testModp() {
        assertEquals(3, humaneval.correct.MODP.modp(3, 5));
        assertEquals(2, humaneval.correct.MODP.modp(1101, 101));
        assertEquals(1, humaneval.correct.MODP.modp(0, 101));
        assertEquals(8, humaneval.correct.MODP.modp(3, 11));
        assertEquals(1, humaneval.correct.MODP.modp(100, 101));
    }
}