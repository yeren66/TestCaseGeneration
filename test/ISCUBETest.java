package humaneval;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ISCUBETest extends TestCase {
    private ISCUBE iscube;

    @Before
    public void setUp() {
        iscube = new ISCUBE();
    }

    @Test
    public void testCubeNumber() {
        int input = 125; // A cube number
        boolean expectedResult = true;
        assertEquals(expectedResult, iscube.iscube(input));
    }

    @Test
    public void testNonCubeNumber() {
        int input = 123; // Not a cube number
        boolean expectedResult = false;
        assertNotSame(expectedResult, iscube.iscube(input));
    }
}
