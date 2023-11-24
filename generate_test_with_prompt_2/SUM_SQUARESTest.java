package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class SUM_SQUARESTest {
    @Test
    public void testSumSquares() {
        int[] lst = new int[] {1, 2, 3};
        assertEquals(6, humaneval.correct.SUM_SQUARES.sum_squares(lst));
    }
    
    @Test
    public void testEmptyList() {
        int[] lst = new int[0];
        assertEquals(0, humaneval.correct.SUM_SQUARES.sum_squares(lst));
    }
    
    @Test
    public void testMultipleOf3And4() {
        int[] lst = new int[] {-1, -5, 2, -1, -5};
        assertEquals(-126, humaneval.correct.SUM_SQUARES.sum_squares(lst));
    }
}