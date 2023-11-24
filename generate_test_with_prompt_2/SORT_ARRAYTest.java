package humaneval;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SORT_ARRAYTest {
    @Test
    public void testSortArray() {
        int[] array = new int[0];
        assertEquals(array, humaneval.correct.SORT_ARRAY.sort_array(array));
        
        array = new int[]{5};
        assertEquals(new int[]{5}, humaneval.correct.SORT_ARRAY.sort_array(array));
        
        array = new int[]{2, 4, 3, 0, 1, 5};
        assertEquals(new int[]{0, 1, 2, 3, 4, 5}, humaneval.correct.SORT_ARRAY.sort_array(array));
        
        array = new int[]{2, 4, 3, 0, 1, 5, 6};
        assertEquals(new int[]{6, 5, 4, 3, 2, 1, 0}, humaneval.correct.SORT_ARRAY.sort_array(array));
    }
}