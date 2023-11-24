package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class CHOOSE_NUMTest {
    @Test
    public void choose_numTEST() {
        assertEquals(-1, CHOOSE_NUM.choose_num(12, 15)); // Test case: (12, 15)
        assertEquals(-1, CHOOSE_NUM.choose_num(13, 12)); // Test case: (13, 12)
        assertEquals(14, CHOOSE_NUM.choose_num(10, 15)); // Test case: (10, 15)
        assertEquals(-1, CHOOSE_NUM.choose_num(16, 30)); // Test case: (16, 30)
    }
}