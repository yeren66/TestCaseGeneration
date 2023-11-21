package humaneval;

import static org.junit.Assert.*;
import org.junit.Test;

public class CHOOSE_NUMTest {
    
    @Test
    public void chooseNumTest() {
        assertEquals(-1, humaneval.correct.CHOOSE_NUM.choose_num(12, 13));
        assertEquals(14, humaneval.correct.CHOOSE_NUM.choose_num(12, 15));
        assertEquals(14, humaneval.correct.CHOOSE_NUM.choose_num(14, 14));
        assertEquals(-1, humaneval.correct.CHOOSE_NUM.choose_num(13, 12));
    }
    
}
