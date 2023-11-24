
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class TRUNCATE_NUMBERTest {
    @Test
    public void truncate_numberTEST() {
        double number = 12.34567890;
        double expected = 12.0;
        assertEquals(expected, TRUNCATE_NUMBER.truncate_number(number), 0);
    }
}
