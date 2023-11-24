package humaneval;

import static org.junit.Assert.*;

public class FIND_CLOSEST_ELEMENTSTest {
    @Test
    public void testFindClosestElements() {
        double[] numbers = new double[] {1, 2, 3, 4, 5};
        double[] result = humaneval.correct.FIND_CLOSEST_ELEMENTS.find_closest_elements(numbers);
        
        // Check that the correct closest elements are returned
        assertEquals(result[0], 1.0);
        assertEquals(result[1], 2.0);
    }
}
