package humaneval;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class STRANGE_SORT_LISTTest {
    @Test
    void testStrangeSortList() {
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);

        List<Integer> result = humaneval.correct.STRANGE_SORT_LIST.strange_sort_list(lst);
        assertEquals(result.get(0), 1);
        assertEquals(result.get(1), 4);
        assertEquals(result.get(2), 2);
        assertEquals(result.get(3), 3);
    }
}