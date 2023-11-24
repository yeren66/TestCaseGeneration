package humaneval.correct;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.X_OR_Y;

public class X_OR_YTest {
    @Test
    public void x_or_yTEST() {
        int n = 7;
        int x = 34;
        int y = 12;
        assertEquals(X_OR_Y.x_or_y(n, x, y), y);
    }
}