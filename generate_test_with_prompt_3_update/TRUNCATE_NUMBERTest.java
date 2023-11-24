
package humaneval.correct;
import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.TRUNCATE_NUMBER;
public class TRUNCATE_NUMBERTest {
    @Test
    public void truncate_numberTEST() {
        double number = 10.25;
        assertEquals(TRUNCATE_NUMBER.truncate_number(number), 0.25, 0);
    }
}