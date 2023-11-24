    
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class DECIMAL_TO_BINARYTest {
    @Test
    public void decimal_to_binaryTEST() {
        assertEquals("db1111db", DECIMAL_TO_BINARY.decimal_to_binary(15));
        assertEquals("db100000db", DECIMAL_TO_BINARY.decimal_to_binary(32));
    }
}