package humaneval.correct;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class ANTI_SHUFFLETest {
    @Test
    public void anti_shuffleTEST() {
        String result = "";
        for (String str : "Hi".split(" ")) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            result += new String(chars) + " ";
        }
        assertEquals("Hi", result.substring(0, result.length() - 1));
    }
}