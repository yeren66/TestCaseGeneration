package humaneval;
import java.util.List;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.FACTORIZE;
import java.util.ArrayList;
import java.util.List;

public class FACTORIZETest {
    @Test
    public void factorizeTEST() {
        // Test case 1: n = 6
        List<Integer> result = new ArrayList<>();
        int[] expectedResult = {2,3};
        assertArrayEquals(expectedResult, result.toArray());
        
        // Test case 2: n = 8
        result = FACTORIZE.factorize(8);
        expectedResult = new int[]{2,2,2};
        assertArrayEquals(expectedResult, result.toArray());
    }
}