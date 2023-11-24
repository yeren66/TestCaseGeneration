package humaneval;

import org.junit.Test;
import java.util.*;

public class MAXIMUM_KTest {
    @Test
    public void testMaximumK() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-3);
        arr.add(-4);
        arr.add(5);
        int k = 3;
        ArrayList<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(-4);
        expectedResult.add(-3);
        expectedResult.add(5);
        assertEquals(expectedResult, humaneval.correct.MAXIMUM_K.maximum_k(arr, k));
    }
}
