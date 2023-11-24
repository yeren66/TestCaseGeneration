
package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.COMPARE;

public class COMPARETest {
    @Test
    public void compareTEST() {
        int[] gameScores = new int[] { 1, 2, 3 };
        int[] guesses = new int[] { 1, 4, 6 };
        
        // Calculate the absolute differences between each element in the input arrays
        int[] result = COMPARE.compare(gameScores, guesses);
        
        assertEquals("Output array has incorrect length", gameScores.length, result.length);
        for (int i = 0; i < gameScores.length; i++) {
            assertEquals("Incorrect absolute difference at index " + i, Math.abs(gameScores[i] - guesses[i]), result[i]);
        }
    }
}
