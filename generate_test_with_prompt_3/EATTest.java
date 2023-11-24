package humaneval.correct;

import org.junit.Test;
import static org.junit.Assert.*;

public class EATTest {
    @Test
    public void eatTEST() {
        int[] result = EAT.eat(5, 6, 10);
        assertArrayEquals(new int[]{11, 4}, result);
    }
}