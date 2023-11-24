package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class ROUNDED_AVGTest {
    @Test
    public void testRoundedAvg() {
        assertEquals("11", humaneval.correct.ROUNDED_AVG.rounded_avg(1, 5));
        assertEquals("011", humaneval.correct.ROUNDED_AVG.rounded_avg(2, 6));
        assertEquals("100001", humaneval.correct.ROUNDED_AVG.rounded_avg(3, 7));
        assertEquals("-1", humaneval.correct.ROUNDED_AVG.rounded_avg(7, 5));
    }
}