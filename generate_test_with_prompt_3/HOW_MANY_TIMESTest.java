  package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class HOW_MANY_TIMESTest {
    @Test
    public void how_many_timesTEST() {
        int actual = HOW_MANY_TIMES.how_many_times("Hello World", "World");
        assertEquals(1, actual);
    }
}