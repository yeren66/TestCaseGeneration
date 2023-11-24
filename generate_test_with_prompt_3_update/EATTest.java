package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.EAT;

public class EATTest {
    @Test
    public void eatTEST() {
        // Test case 1: there are enough remaining carrots to complete the meal
        int[] result = EAT.eat(5, 6, 10);
        assertEquals(result[0], 11); // total number of eaten carrots after the meal
        assertEquals(result[1], 4); // number of remaining carrots left

        // Test case 2: there are not enough remaining carrots to complete the meal, but there is still some food left
        result = EAT.eat(4, 8, 9);
        assertEquals(result[0], 12); // total number of eaten carrots after the meal
        assertEquals(result[1], 1); // number of remaining carrots left

        // Test case 3: there are not enough remaining carrots to complete the meal, and there is no food left
        result = EAT.eat(1, 10, 10);
        assertEquals(result[0], 11); // total number of eaten carrots after the meal
        assertEquals(result[1], 0); // number of remaining carrots left

        // Test case 4: there are enough remaining carrots to complete the meal, but only just enough
        result = EAT.eat(2, 11, 5);
        assertEquals(result[0], 7); // total number of eaten carrots after the meal
        assertEquals(result[1], 0); // number of remaining carrots left
    }
}