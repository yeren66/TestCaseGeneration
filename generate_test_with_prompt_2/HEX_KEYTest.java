package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class HEX_KEYTest {
    @Test
    public void testHexKey() {
        assertEquals(1, humaneval.correct.HEX_KEY.hex_key("AB"));
        assertEquals(2, humaneval.correct.HEX_KEY.hex_key("1077E"));
        assertEquals(4, humaneval.correct.HEX_KEY.hex_key("ABED1A33"));
        assertEquals(6, humaneval.correct.HEX_KEY.hex_key("123456789ABCDEF0"));
        assertEquals(2, humaneval.correct.HEX_KEY.hex_key("2020"));
    }
}