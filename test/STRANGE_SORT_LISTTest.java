package humaneval;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class STRANGE_SORT_LISTTest {
    @Test
    public void testStrangeSort() {
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        assertEquals("[1, 4, 2, 3]", humaneval.correct.STRANGE_SORT_LIST.strange_sort_list(lst).toString());
    }
    
    @Test
    public void testStrangeSortWithMultipleMinValues() {
        List<Integer> lst = new ArrayList<>();
        lst.add(5);
        lst.add(5);
        lst.add(5);
        lst.add(5);
        assertEquals("[5, 5, 5, 5]", humaneval.correct.STRANGE_SORT_LIST.strange_sort_list(lst).toString());
    }
    
    @Test
    public void testStrangeSortWithEmptyList() {
        List<Integer> lst = new ArrayList<>();
        assertEquals("[]", humaneval.correct.STRANGE_SORT_LIST.strange_sort_list(lst).toString());
    }
}