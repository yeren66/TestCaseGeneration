package humaneval;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class WILL_IT_FLYTest {
    @Test
    void willItFly_balancedListLessThanMaxWeight() {
        int[] q = new int[]{1, 2};
        int w = 5;
        boolean result = humaneval.correct.WILL_IT_FLY.will_it_fly(q, w);
        assertFalse(result);
    }
    
    @Test
    void willItFly_balancedListMoreThanMaxWeight() {
        int[] q = new int[]{3, 2, 3};
        int w = 1;
        boolean result = humaneval.correct.WILL_IT_FLY.will_it_fly(q, w);
        assertFalse(result);
    }
    
    @Test
    void willItFly_balancedListLessThanMaxWeightWithPalindromicList() {
        int[] q = new int[]{3, 2, 3};
        int w = 9;
        boolean result = humaneval.correct.WILL_IT_FLY.will_it_fly(q, w);
        assertTrue(result);
    }
    
    @Test
    void willItFly_balancedListLessThanMaxWeightWithSingleElement() {
        int[] q = new int[]{3};
        int w = 5;
        boolean result = humaneval.correct.WILL_IT_FLY.will_it_fly(q, w);
        assertTrue(result);
    }
}