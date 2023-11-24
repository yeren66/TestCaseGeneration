package humaneval;
import java.util.Arrays;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.SORT_ARRAY;
import java.util.Arrays;

public class SORT_ARRAYTest {
    @Test
    public void sort_arrayTEST() {
        int[] testArr = new int[]{2, 4, 3, 0, 1, 5};
        int[] expected = new int[]{0, 1, 2, 3, 4, 5};
        assertArrayEquals(expected, SORT_ARRAY.sort_array(testArr));
    }
}