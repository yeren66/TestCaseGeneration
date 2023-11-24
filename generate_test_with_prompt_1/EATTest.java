package humaneval;

import static org.junit.Assert.*;

public class EATTest {
    @Test
    public void testEatWithEnoughRemainingCarrots() {
        int[] expected = new int[] {11, 4};
        assertArrayEquals(expected, humaneval.correct.EAT.eat(5, 6, 10));
    }
    
    @Test
    public void testEatWithNotEnoughRemainingCarrots() {
        int[] expected = new int[] {12, 1};
        assertArrayEquals(expected, humaneval.correct.EAT.eat(4, 8, 9));
    }
    
    @Test
    public void testEatWithZeroNeed() {
        int[] expected = new int[] {0, 10};
        assertArrayEquals(expected, humaneval.correct.EAT.eat(0, 0, 10));
    }
    
    @Test
    public void testEatWithNegativeNumbers() {
        int[] expected = new int[] {-1, -2};
        assertArrayEquals(expected, humaneval.correct.EAT.eat(-1, -2, -3));
    }
}
