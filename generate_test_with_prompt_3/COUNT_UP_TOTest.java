package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class COUNT_UP_TOTest {
    @Test
    public void count_up_toTEST() {
        // Test case 1: n = 5, expected result = [2,3]
        List<Integer> actualResult1 = COUNT_UP_TO.count_up_to(5);
        assertEquals("[2,3]", actualResult1.toString());
        
        // Test case 2: n = 11, expected result = [2,3,5,7]
        List<Integer> actualResult2 = COUNT_UP_TO.count_up_to(11);
        assertEquals("[2,3,5,7]", actualResult2.toString());
        
        // Test case 3: n = 0, expected result = []
        List<Integer> actualResult3 = COUNT_UP_TO.count_up_to(0);
        assertEquals("[]", actualResult3.toString());
        
        // Test case 4: n = 20, expected result = [2,3,5,7,11,13,17,19]
        List<Integer> actualResult4 = COUNT_UP_TO.count_up_to(20);
        assertEquals("[2,3,5,7,11,13,17,19]", actualResult4.toString());
        
        // Test case 5: n = 1, expected result = []
        List<Integer> actualResult5 = COUNT_UP_TO.count_up_to(1);
        assertEquals("[]", actualResult5.toString());
    }
}