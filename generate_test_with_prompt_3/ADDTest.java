package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class ADDTest {
    @Test
    public void addTEST() {
        int result = ADD.add(2, 3);
        assertEquals(5, result);

        result = ADD.add(5, 7);
        assertEquals(12, result);
    }
}