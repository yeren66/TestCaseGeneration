package humaneval;

import static org.junit.Assert.*;
import java.util.HashSet;

public class COUNT_DISTINCT_CHARACTERSTest {
    @Test
    public void testCountDistinctCharacters() {
        String string = "hello";
        int expectedSize = 5;

        HashSet<Character> distinct = new HashSet<>();
        for (char c : string.toCharArray()) {
            if (!distinct.contains(Character.toLowerCase(c))) {
                distinct.add(Character.toLowerCase(c));
            }
        }
        int actualSize = distinct.size();

        assertEquals(expectedSize, actualSize);
    }
}
