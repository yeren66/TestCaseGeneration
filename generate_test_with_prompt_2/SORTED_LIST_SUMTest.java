package humaneval;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;

public class SORTED_LIST_SUMTest {
    @Test
    public void testSortedListSum() {
        ArrayList<String> lst = new ArrayList<>();
        lst.add("aa");
        lst.add("a");
        lst.add("aaa");
        lst.add("ab");
        lst.add("cd");

        ArrayList<String> result = humaneval.correct.SORTED_LIST_SUM.sorted_list_sum(lst);
        assertEquals(result, Collections.singletonList("ab"));
    }
}