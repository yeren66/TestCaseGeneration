package humaneval;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

public class LONGESTTest {
    @Test
    public void testLongest() {
        List<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("world");
        assertEquals(LONGEST.longest(strings), "hello");
    }
}