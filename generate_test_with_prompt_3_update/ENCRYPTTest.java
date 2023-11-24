package humaneval.correct;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.ENCRYPT;

public class ENCRYPTTest {
    @Test
    public void encryptTEST() {
        String input = "hi";
        String expectedOutput = "lm";
        assertEquals(expectedOutput, ENCRYPT.encrypt(input));

        input = "asdfghjkl";
        expectedOutput = "ewhjklnop";
        assertEquals(expectedOutput, ENCRYPT.encrypt(input));

        input = "gf";
        expectedOutput = "kj";
        assertEquals(expectedOutput, ENCRYPT.encrypt(input));

        input = "et";
        expectedOutput = "ix";
        assertEquals(expectedOutput, ENCRYPT.encrypt(input));
    }
}