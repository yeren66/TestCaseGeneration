
package humaneval;
import java.util.List;
import java.util.Arrays;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.BF;
import java.util.ArrayList;
import java.util.Arrays;

public class BFTest {
    @Test
    public void bfTEST() {
        // Test case 1: planet1 = "Jupiter", planet2 = "Neptune"
        ArrayList<String> expectedResult = new ArrayList<String>(Arrays.asList("Saturn", "Uranus"));
        assertEquals(expectedResult, BF.bf("Jupiter", "Neptune"));
        
        // Test case 2: planet1 = "Earth", planet2 = "Mercury"
        expectedResult = new ArrayList<String>(Arrays.asList("Venus"));
        assertEquals(expectedResult, BF.bf("Earth", "Mercury"));
        
        // Test case 3: planet1 = "Mercury", planet2 = "Uranus"
        expectedResult = new ArrayList<String>(Arrays.asList("Venus", "Earth", "Mars", "Jupiter", "Saturn"));
        assertEquals(expectedResult, BF.bf("Mercury", "Uranus"));
    }
}
