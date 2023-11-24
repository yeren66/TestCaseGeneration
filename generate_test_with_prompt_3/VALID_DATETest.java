
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class VALID_DATETest {
    @Test
    public void valid_dateTEST() {
        assertTrue(VALID_DATE.valid_date("03-11-2000")); // should return true since 11 is a valid day for March
        assertFalse(VALID_DATE.valid_date("15-01-2012")); // should return false since there are only 31 days in January
        assertFalse(VALID_DATE.valid_date("04-0-2040")); // should return false since the day cannot be 0
        assertTrue(VALID_DATE.valid_date("06-04-2020")); // should return true since April has 30 days
        assertFalse(VALID_DATE.valid_date("06/04/2020")); // should return false since the date format is not in mm-dd-yyyy
    }
}
