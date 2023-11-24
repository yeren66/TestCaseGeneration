package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.CHANGE_BASE;

public class CHANGE_BASETest {
    @Test
    public void change_baseTEST() {
        assertEquals("22", CHANGE_BASE.change_base(8, 3));
        assertEquals("1000", CHANGE_BASE.change_base(8, 2));
        assertEquals("111", CHANGE_BASE.change_base(7, 2));
    }
}