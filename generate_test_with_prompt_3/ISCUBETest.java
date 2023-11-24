package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ISCUBETest {
    @Test
    public void iscudeTEST() {
        assertTrue(ISCUBE.iscube(-1));
        assertTrue(ISCUBE.iscube(0));
        assertTrue(ISCUBE.iscube(1));
        assertFalse(ISCUBE.iscube(2));
    }
}