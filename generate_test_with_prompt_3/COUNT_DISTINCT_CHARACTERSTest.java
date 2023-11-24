package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashSet;

public class COUNT_DISTINCT_CHARACTERSTest {
    @Test
    public void count_distinct_charactersTEST() {
        String input = "hello";
        HashSet<Character> distinct = new HashSet<>();
        
        for (char c : input.toCharArray()) {
            if (!distinct.contains(Character.toLowerCase(c))) {
                distinct.add(Character.toLowerCase(c));
            }
        }
        assertEquals(5, distinct.size());
    }
}