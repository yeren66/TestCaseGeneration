package humaneval.correct;

import org.junit.Test;
import static org.junit.Assert.*;

public class ENCRYPTTest {
    @Test
    public void encryptTEST() {
        String expected = "lm";
        assertEquals(expected, ENCRYPT.encrypt("hi"));
        
        String expected2 = "ewhjklnop";
        assertEquals(expected2, ENCRYPT.encrypt("asdfghjkl"));
        
        String expected3 = "kj";
        assertEquals(expected3, ENCRYPT.encrypt("gf"));
        
        String expected4 = "ix";
        assertEquals(expected4, ENCRYPT.encrypt("et"));
    }
}