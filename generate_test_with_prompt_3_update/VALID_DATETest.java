
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.VALID_DATE;

public class VALID_DATETest {
    @Test
    public void valid_dateTEST() {
        assertTrue(VALID_DATE.valid_date("03-11-2000")); // True
        assertFalse(VALID_DATE.valid_date("15-01-2012")); // False
        assertFalse(VALID_DATE.valid_date("04-0-2040")); // False
        assertTrue(VALID_DATE.valid_date("06-04-2020")); // True
        assertFalse(VALID_DATE.valid_date("06/04/2020")); // False
    }
}