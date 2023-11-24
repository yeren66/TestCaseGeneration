
package humaneval;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class UNIQUETest {
    @Test
    public void testUnique() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        assertEquals(list, humaneval.correct.UNIQUE.unique(list));
    }

    @Test
    public void testUniqueEmpty() {
        List<Integer> list = new ArrayList<>();

        assertEquals(Collections.<Integer>emptyList(), humaneval.correct.UNIQUE.unique(list));
    }

    @Test
    public void testUniqueNull() {
        assertEquals(null, humaneval.correct.UNIQUE.unique(null));
    }

    @Test
    public void testUniqueWithDuplicates() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);

        assertEquals(list, humaneval.correct.UNIQUE.unique(list));
    }
}
