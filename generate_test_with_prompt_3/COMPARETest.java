    
package humaneval;    

import org.junit.Test;
import static org.junit.Assert.*;

public class COMPARETest {
    @Test
    public void compareTEST() {
        int[] gameScores = new int[]{1,2,3};
        int[] guessedScores = new int[]{4,5,6};
        
        assertArrayEquals(new int[]{3, 3, 3}, COMPARE.compare(gameScores, guessedScores));
    }
}