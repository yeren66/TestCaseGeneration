package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class TRUNCATE_NUMBERTest {
    @Test
    public void testTruncateNumber() {
        assertEquals(1, humaneval.correct.TRUNCATE_NUMBER.truncate_number(1.5), 0.001);
        assertEquals(-2.3, humaneval.correct.TRUNCATE_NUMBER.truncate_number(-2.34), 0.001);
        assertEquals(1.75, humaneval.correct.TRUNCATE_NUMBER.truncate_number(1.75), 0.001);
    }
}