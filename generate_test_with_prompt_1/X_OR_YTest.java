
package humaneval;

import static org.junit.Assert.*;

public class X_OR_YTest {
    
    @Test
    public void testXOrY() {
        assertEquals(34, humaneval.correct.X_OR_Y.x_or_y(7, 34, 12));
        assertEquals(5, humaneval.correct.X_OR_Y.x_or_y(15, 8, 5));
    }
}
