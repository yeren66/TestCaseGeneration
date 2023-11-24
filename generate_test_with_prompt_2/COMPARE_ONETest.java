package humaneval;

import static org.junit.Assert.*;
import java.lang.Object;
import humaneval.correct.COMPARE_ONE;

public class COMPARE_ONETest {
    private COMPARE_ONE compareOne;

    @Before
    public void setUp() throws Exception {
        compareOne = new COMPARE_ONE();
    }

    @Test
    public void testCompareInteger() {
        Object result = compareOne.compare_one(1, 2);
        assertEquals(result, 2);
    }

    @Test
    public void testCompareDouble() {
        Object result = compareOne.compare_one(1.0, 2.5);
        assertEquals(result, 2.5);
    }

    @Test
    public void testCompareStringInteger() {
        Object result = compareOne.compare_one("1", 2);
        assertEquals(result, "1");
    }

    @Test
    public void testCompareStringDouble() {
        Object result = compareOne.compare_one("1.0", 2.5);
        assertEquals(result, "1.0");
    }

    @Test
    public void testEqualResult() {
        Object result = compareOne.compare_one(2, 2);
        assertNull(result);
    }
}
