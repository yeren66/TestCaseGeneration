package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class HEX_KEYTest {

    @Test
    public void testHexKey() {
        String num = "AB";
        assertEquals(1, humaneval.correct.HEX_KEY.hex_key(num));
    }

    @Test
    public void testHexKeyWithTwoPrimes() {
        String num = "1077E";
        assertEquals(2, humaneval.correct.HEX_KEY.hex_key(num));
    }

    @Test
    public void testHexKeyWithFourPrimes() {
        String num = "ABED1A33";
        assertEquals(4, humaneval.correct.HEX_KEY.hex_key(num));
    }

    @Test
    public void testHexKeyWithSixPrimes() {
        String num = "123456789ABCDEF0";
        assertEquals(6, humaneval.correct.HEX_KEY.hex_key(num));
    }

    @Test
    public void testHexKeyWithTwoZeroes() {
        String num = "2020";
        assertEquals(2, humaneval.correct.HEX_KEY.hex_key(num));
    }
}