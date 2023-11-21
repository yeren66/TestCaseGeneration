package humaneval;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SORTED_LIST_SUMTest {
    @Test
    public void testSortedListSum() {
        ArrayList<String> lst = new ArrayList<>();
        lst.add("aa");
        lst.add("a");
        lst.add("aaa");
        assertEquals(SORTED_LIST_SUM.sorted_list_sum(lst), Collections.singletonList("aa"));
    }
}