package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class EVEN_ODD_COUNTTest {
    @Test
    public void even_odd_countTEST() {
        assertArrayEquals(new int[] {1, 0}, EVEN_ODD_COUNT.even_odd_count(-12)); // should return (1, 0)
        assertArrayEquals(new int[] {1, 2}, EVEN_ODD_COUNT.even_odd_count(123)); // should return (1, 2)
    }
}