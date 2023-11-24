package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class BELOW_ZEROTest {
    @Test
    public void testBelowZero() {
        List<Integer> operations = Arrays.asList(1, 2, -3, 4);
        assertTrue(BELOW_ZERO.below_zero(operations));
    }
}