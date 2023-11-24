
package humaneval;

import static org.junit.Assert.*;

public class TRUNCATE_NUMBERTest {
    @Test
    public void testTruncateNumber() {
        double number = 10.56789;
        assertEquals(number % 1.0, humaneval.correct.TRUNCATE_NUMBER.truncate_number(number), 0.0);
    }
}
