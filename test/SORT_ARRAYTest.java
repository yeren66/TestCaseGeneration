package humaneval;
import static org.junit.Assert.*;

public class SORT_ARRAYTest {

    @Test
    public void sortEmptyArray() {
        int[] array = new int[0];
        assertEquals(array, humaneval.correct.SORT_ARRAY.sort_array(array));
    }

    @Test
    public void sortSingleElementArray() {
        int[] array = new int[]{5};
        assertEquals(array, humaneval.correct.SORT_ARRAY.sort_array(array));
    }

    @Test
    public void sortAscendingOrder() {
        int[] array = new int[]{2, 4, 3, 0, 1, 5};
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5}, humaneval.correct.SORT_ARRAY.sort_array(array));
    }

    @Test
    public void sortDescendingOrder() {
        int[] array = new int[]{2, 4, 3, 0, 1, 5, 6};
        assertArrayEquals(new int[]{6, 5, 4, 3, 2, 1, 0}, humaneval.correct.SORT_ARRAY.sort_array(array));
    }
}