package humaneval;
import static org.junit.Assert.*;

public class SUM_SQUARESTest {
    @Test
    public void testEmptyList() {
        int[] lst = new int[0];
        assertEquals(0, humaneval.correct.SUM_SQUARES.sum_squares(lst));
    }

    @Test
    public void testSingleItemList() {
        int[] lst = {1};
        assertEquals(1, humaneval.correct.SUM_SQUARES.sum_squares(lst));
    }

    @Test
    public void testMultipleItemsList() {
        int[] lst = {1, 2, 3};
        assertEquals(6, humaneval.correct.SUM_SQUARES.sum_squares(lst));
    }

    @Test
    public void testMultipleItemsListWithOddIndexes() {
        int[] lst = {1, 2, 3, 4, 5};
        assertEquals(6 + (9 * 9) + (25 * 25), humaneval.correct.SUM_SQUARES.sum_squares(lst));
    }
}