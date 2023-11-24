package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.GET_ROW;
import java.util.ArrayList;

public class GET_ROWTest extends JUnit.framework.TestCase {
    @Test
    public void TupleTEST() {
        // Test that the Tuple constructor sets the x and y values correctly
        Tuple tuple = new Tuple(1, 2);
        assertEquals(tuple.x, 1);
        assertEquals(tuple.y, 2);

        // Test that the equals() method returns true when comparing two tuples with the same coordinates
        Tuple tuple2 = new Tuple(1, 2);
        assertTrue(tuple.equals(tuple2));
    }
}