package humaneval;

import org.junit.Test;

public class VALID_DATETest {

    @Test
    public void testValidDate() {
        String date = "03-11-2000";
        assertTrue(VALID_DATE.valid_date(date));

        date = "15-01-2012";
        assertFalse(VALID_DATE.valid_date(date));

        date = "04-0-2040";
        assertFalse(VALID_DATE.valid_date(date));

        date = "06-04-2020";
        assertTrue(VALID_DATE.valid_date(date));
    }
}