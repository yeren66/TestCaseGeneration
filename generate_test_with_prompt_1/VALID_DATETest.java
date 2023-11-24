package humaneval;

import static org.junit.Assert.*;
import org.junit.Test;

public class VALID_DATETest {
    @Test
    public void testValidDate() {
        assertTrue(VALID_DATE.valid_date("03-11-2000"));
        assertFalse(VALID_DATE.valid_date("15-01-2012"));
        assertFalse(VALID_DATE.valid_date("04-0-2040"));
        assertTrue(VALID_DATE.valid_date("06-04-2020"));
    }
}
