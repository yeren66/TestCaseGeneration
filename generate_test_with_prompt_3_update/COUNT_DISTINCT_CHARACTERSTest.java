
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.COUNT_DISTINCT_CHARACTERS;
import java.util.HashSet;

public class COUNT_DISTINCT_CHARACTERSTest {
    @Test
    public void count_distinct_charactersTEST() {
        String input = "hello world";
        HashSet<Character> expected = new HashSet<>();
        expected.add('h');
        expected.add('e');
        expected.add('l');
        expected.add('o');
        expected.add('w');
        expected.add('r');
        expected.add('d');
        assertEquals(expected, COUNT_DISTINCT_CHARACTERS.count_distinct_characters(input));
    }
}
