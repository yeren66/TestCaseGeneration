package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.MODP;

public class MODPTest {
    @Test
    public void modpTEST() {
        int n = 3;
        int p = 5;
        int expectedResult = 3;

        int actualResult = MODP.modp(n, p);

        assertEquals(expectedResult, actualResult);
    }
}