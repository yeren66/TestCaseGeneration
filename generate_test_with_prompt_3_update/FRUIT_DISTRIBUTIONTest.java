
package humaneval.correct;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.FRUIT_DISTRIBUTION;

public class FRUIT_DISTRIBUTIONTest {
    @Test
    public void fruit_distributionTEST() {
        String input = "5 apples and 6 oranges";
        int n = 19;
        assertEquals(8, FRUIT_DISTRIBUTION.fruit_distribution(input, n));
        
        input = "0 apples and 1 oranges";
        n = 3;
        assertEquals(2, FRUIT_DISTRIBUTION.fruit_distribution(input, n));
        
        input = "2 apples and 3 oranges";
        n = 100;
        assertEquals(95, FRUIT_DISTRIBUTION.fruit_distribution(input, n));
        
        input = "100 apples and 1 oranges";
        n = 120;
        assertEquals(19, FRUIT_DISTRIBUTION.fruit_distribution(input, n));
    }
}