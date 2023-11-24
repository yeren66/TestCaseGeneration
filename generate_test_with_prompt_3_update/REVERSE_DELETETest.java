package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.REVERSE_DELETE;
import java.util.ArrayList;

public class REVERSE_DELETETest {
    @Test
    public void reverse_deleteTEST() {
        String s = "abcde";
        String c = "ae";
        ArrayList<Object> res = REVERSE_DELETE.reverse_delete(s, c);
        assertEquals("bcd", res.get(0));
        assertFalse((Boolean)res.get(1));
    }
}