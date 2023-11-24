package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class COMPARETest {
    @Test
    public void testCompare() {
        int[] gameScores = new int[] {1, 2, 3};
        int[] guesses = new int[] {3, 2, 1};
        int[] expectedResult = new int[] {0, 0, 0};

        COMPARE humaneval.correct.COMPARE.compare = new COMPARE();
        int[] result = humaneval.correct.COMPARE.compare.compare(gameScores, guesses);

        assertArrayEquals(expectedResult, result);
    }
}