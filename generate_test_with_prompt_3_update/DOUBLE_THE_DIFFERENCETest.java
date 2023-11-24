
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.DOUBLE_THE_DIFFERENCE;

public class DOUBLE_THE_DIFFERENCETest {
    @Test
    public void double_the_differenceTEST() {
        // Test 1: Empty list
        assertEquals(0, DOUBLE_THE_DIFFERENCE.double_the_difference(new double[0]));

        // Test 2: List with all odd numbers >= 0
        double[] lst = new double[]{1, 3, 5};
        assertEquals(14, DOUBLE_THE_DIFFERENCE.double_the_difference(lst));

        // Test 3: List with even numbers and negative numbers
        lst = new double[]{2, -3, 0, -2};
        assertEquals(0, DOUBLE_THE_DIFFERENCE.double_the_difference(lst));

        // Test 4: List with negative and positive numbers
        lst = new double[]{-1, 2, 3};
        assertEquals(1 + 9, DOUBLE_THE_DIFFERENCE.double_the_difference(lst));

        // Test 5: List with a single number that is odd and >= 0
        lst = new double[]{1};
        assertEquals(1, DOUBLE_THE_DIFFERENCE.double_the_difference(lst));
    }
}