package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class HEX_KEYTest {
    @Test
    public void hex_keyTEST() {
        assertEquals(1, HEX_KEY.hex_key("AB")); // 2, 3, 5, 7, B, D
        assertEquals(2, HEX_KEY.hex_key("1077E")); // 2, 3, 5, 7, B, D
        assertEquals(4, HEX_KEY.hex_key("ABED1A33")); // 2, 3, 5, 7, B, D
        assertEquals(6, HEX_KEY.hex_key("123456789ABCDEF0")); // 2, 3, 5, 7, B, D
        assertEquals(2, HEX_KEY.hex_key("2020")); // 2, 3, 5, 7, B, D
    }
}