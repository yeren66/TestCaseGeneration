package humaneval;

import static org.junit.Assert.*;

public class STRING_TO_MD5Test {
    @Test
    public void testStringToMd5() throws NoSuchAlgorithmException {
        assertEquals("3e25960a79dbc69b674cd4ec67a72c62", humaneval.correct.STRING_TO_MD5.string_to_md5("Hello world"));
    }
    
    @Test
    public void testStringToMd5Empty() throws NoSuchAlgorithmException {
        assertNull(STRING_TO_MD5.string_to_md5(""));
    }
}