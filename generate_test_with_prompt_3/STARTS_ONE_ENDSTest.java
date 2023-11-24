package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class STARTS_ONE_ENDSTest {
    @Test
    public void starts_one_endsTEST() {
        int n = 1;
        int expectedResult = 1;
        int actualResult = STARTS_ONE_ENDS.starts_one_ends(n);
        assertEquals(expectedResult, actualResult);
    }
}