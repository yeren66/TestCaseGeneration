
package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.SPLIT_WORDS;

public class SPLIT_WORDSTest {
    @Test
    public void split_wordsTEST() {
        String input1 = "Hello world!";
        String[] expected1 = {"Hello", "world!"};
        assertArrayEquals(expected1, SPLIT_WORDS.split_words(input1));

        String input2 = "Hello,world!";
        String[] expected2 = {"Hello", "world!"};
        assertArrayEquals(expected2, SPLIT_WORDS.split_words(input2));

        String input3 = "abcdef";
        int expected3 = 3;
        assertEquals(expected3, SPLIT_WORDS.split_words(input3).length);
    }
}
