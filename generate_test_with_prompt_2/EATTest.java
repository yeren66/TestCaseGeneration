package humaneval;
import static org.junit.Assert.*;

public class EATTest {
    @Test
    public void testEat() {
        int[] result1 = humaneval.correct.EAT.eat(5, 6, 10);
        assertArrayEquals(result1, new int[] {11, 4});
        
        int[] result2 = humaneval.correct.EAT.eat(4, 8, 9);
        assertArrayEquals(result2, new int[] {12, 1});
        
        int[] result3 = humaneval.correct.EAT.eat(1, 10, 10);
        assertArrayEquals(result3, new int[] {11, 0});
        
        int[] result4 = humaneval.correct.EAT.eat(2, 11, 5);
        assertArrayEquals(result4, new int[] {7, 0});
    }
}