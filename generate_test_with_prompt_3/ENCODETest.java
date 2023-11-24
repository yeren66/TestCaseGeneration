package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class ENCODETest {
    @Test
    public void encodeTEST() {
        String message = "test";
        String expectedOutput = "tgst";
        assertEquals(expectedOutput, ENCODE.encode(message));
        
        message = "This is a message";
        expectedOutput = "tHKS KS C MGSSCGG";
        assertEquals(expectedOutput, ENCODE.encode(message));
    }
}