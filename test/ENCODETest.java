
package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.ENCODE;

public class ENCODETest {
    @Test
    public void encodeTEST() {
        String expected = "TGST";
        String actual = ENCODE.encode("test");
        assertEquals(expected, actual);
        
        expected = "tHKS KS C MGSSCGG";
        actual = ENCODE.encode("This is a message");
        assertEquals(expected, actual);
    }
}