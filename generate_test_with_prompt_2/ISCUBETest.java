package humaneval;
import static org.junit.Assert.*;

public class ISCUBETest {
    @Test
    public void testIscube() {
        assertTrue(ISCUBE.iscube(1)); // True
        assertFalse(ISCUBE.iscube(2)); // False
        assertTrue(ISCUBE.iscube(-1)); // True
        assertTrue(ISCUBE.iscube(64)); // True
        assertTrue(ISCUBE.iscube(0)); // True
        assertFalse(ISCUBE.iscube(180)); // False
    }
}