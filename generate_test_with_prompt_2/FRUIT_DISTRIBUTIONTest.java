package humaneval;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FRUIT_DISTRIBUTIONTest {
    @Test
    void humaneval.correct.FRUIT_DISTRIBUTION.fruit_distribution_test() {
        int result = humaneval.correct.FRUIT_DISTRIBUTION.fruit_distribution("5 apples and 6 oranges", 19);
        assertEquals(8, result);
        
        result = humaneval.correct.FRUIT_DISTRIBUTION.fruit_distribution("0 apples and 1 oranges", 3);
        assertEquals(2, result);
        
        result = humaneval.correct.FRUIT_DISTRIBUTION.fruit_distribution("2 apples and 3 oranges", 100);
        assertEquals(95, result);
        
        result = humaneval.correct.FRUIT_DISTRIBUTION.fruit_distribution("100 apples and 1 oranges", 120);
        assertEquals(19, result);
    }
}
