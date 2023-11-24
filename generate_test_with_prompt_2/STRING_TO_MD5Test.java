package humaneval;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class STRING_TO_MD5Test {
    @Test
    public void testStringToMd5() throws NoSuchAlgorithmException {
        String text = "Hello world";
        String expectedHash = "3e25960a79dbc69b674cd4ec67a72c62";
        assertEquals(expectedHash, humaneval.correct.STRING_TO_MD5.string_to_md5(text));
    }
}