
package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.FIND_CLOSEST_ELEMENTS;

public class FIND_CLOSEST_ELEMENTSTest {
    @Test
    public void find_closest_elementsTEST() {
        double[] numbers = new double[] {1, 2, 3, 4, 5};
        double[] expectedResult = new double[] {2, 3};
        assertArrayEquals(expectedResult, FIND_CLOSEST_ELEMENTS.find_closest_elements(numbers), 0);
    }
}
