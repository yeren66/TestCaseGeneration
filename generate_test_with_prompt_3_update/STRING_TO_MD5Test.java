
package humaneval.correct;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.STRING_TO_MD5;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;

public class STRING_TO_MD5Test {
    @Test
    public void string_to_md5TEST() throws NoSuchAlgorithmException {
        String text = "Hello world";
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(text.getBytes());
        byte[] digest = md.digest();
        String expectedMd5Hash = DatatypeConverter.printHexBinary(digest).toLowerCase();

        assertEquals(expectedMd5Hash, STRING_TO_MD5.string_to_md5(text));
    }
}