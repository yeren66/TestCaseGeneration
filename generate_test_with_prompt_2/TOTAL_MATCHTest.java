package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class TOTAL_MATCHTest {
    @Test
    public void testTotalMatch() {
        List<String> lst1 = new ArrayList<>();
        List<String> lst2 = new ArrayList<>();
        
        // Test 1: empty lists
        assertEquals(0, humaneval.correct.TOTAL_MATCH.total_match(lst1, lst2).size());
        
        // Test 2: same number of chars
        lst1.add("hi");
        lst1.add("admin");
        lst2.add("hI");
        lst2.add("Hi");
        assertEquals(2, humaneval.correct.TOTAL_MATCH.total_match(lst1, lst2).size());
        
        // Test 3: first list has less chars
        lst1.clear();
        lst2.clear();
        lst1.add("hi");
        lst1.add("admin");
        lst2.add("hI");
        lst2.add("Hi");
        lst2.add("project");
        assertEquals(2, humaneval.correct.TOTAL_MATCH.total_match(lst1, lst2).size());
        
        // Test 4: first list has same chars
        lst1.clear();
        lst2.clear();
        lst1.add("hi");
        lst1.add("admin");
        lst2.add("hI");
        lst2.add("hi");
        assertEquals(2, humaneval.correct.TOTAL_MATCH.total_match(lst1, lst2).size());
        
        // Test 5: first list has more chars
        lst1.clear();
        lst2.clear();
        lst1.add("4");
        lst2.add("1");
        lst2.add("2");
        lst2.add("3");
        lst2.add("4");
        lst2.add("5");
        assertEquals(1, humaneval.correct.TOTAL_MATCH.total_match(lst1, lst2).size());
    }
}