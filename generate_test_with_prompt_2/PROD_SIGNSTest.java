package humaneval;

import static org.junit.Assert.*;

public class PROD_SIGNSTest {
    @Test
    public void testProdSigns() {
        int[] arr = new int[] {1, 2, 2, -4};
        assertEquals(-9, humaneval.correct.PROD_SIGNS.prod_signs(arr));
        
        arr = new int[] {0, 1};
        assertEquals(0, humaneval.correct.PROD_SIGNS.prod_signs(arr));
        
        arr = new int[] {};
        assertEquals(-10, humaneval.correct.PROD_SIGNS.prod_signs(arr));
    }
}
