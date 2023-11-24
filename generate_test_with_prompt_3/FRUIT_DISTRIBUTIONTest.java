package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class FRUIT_DISTRIBUTIONTest {
    @Test
    public void fruit_distributionTEST() {
        assertEquals(8, FRUIT_DISTRIBUTION.fruit_distribution("5 apples and 6 oranges", 19));
        assertEquals(2, FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 1 oranges", 3));
        assertEquals(95, FRUIT_DISTRIBUTION.fruit_distribution("2 apples and 3 oranges", 100));
        assertEquals(19, FRUIT_DISTRIBUTION.fruit_distribution("100 apples and 1 oranges", 120));
    }
}