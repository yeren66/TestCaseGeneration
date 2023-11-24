package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class ENCRYPTTest {
    @Test
    public void testEncrypt() {
        assertEquals("lm", humaneval.correct.ENCRYPT.encrypt("hi"));
        assertEquals("ewhjklnop", humaneval.correct.ENCRYPT.encrypt("asdfghjkl"));
        assertEquals("kj", humaneval.correct.ENCRYPT.encrypt("gf"));
        assertEquals("ix", humaneval.correct.ENCRYPT.encrypt("et"));
    }
}
