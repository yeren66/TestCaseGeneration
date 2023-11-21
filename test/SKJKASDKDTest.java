package humaneval;
import static org.junit.Assert.*;
import org.junit.Test;

public class SKJKASDKDTest {
    @Test
    public void testIsPrime() {
        // Test for prime numbers
        assertTrue(SKJKASDKD.is_prime(1));
        assertFalse(SKJKASDKD.is_prime(2));
        assertTrue(SKJKASDKD.is_prime(3));
        assertFalse(SKJKASDKD.is_prime(4));
        assertTrue(SKJKASDKD.is_prime(5));
        assertFalse(SKJKASDKD.is_prime(6));
    }
    
    @Test
    public void testSkjkasdkd() {
        // Test for the correctness of the method
        int[] lst = new int[]{0,3,2,1,3,5,7,4,5,5,5,2,181,32,4,32,3,2,32,324,4,3};
        assertEquals(10, SKJKASDKD.skjkasdkd(lst));
        
        lst = new int[]{1,0,1,8,2,4597,2,1,3,40,1,2,1,2,4,2,5,1};
        assertEquals(25, SKJKASDKD.skjkasdkd(lst));
        
        lst = new int[]{1,3,1,32,5107,34,83278,109,163,23,2323,32,30,1,9,3};
        assertEquals(13, SKJKASDKD.skjkasdkd(lst));
        
        lst = new int[]{0,724,32,71,99,32,6,0,5,91,83,0,5,6};
        assertEquals(11, SKJKASDKD.skjkasdkd(lst));
        
        lst = new int[]{0,81,12,3,1,21};
        assertEquals(3, SKJKASDKD.skjkasdkd(lst));
        
        lst = new int[]{0,8,1,2,1,7};
        assertEquals(7, SKJKASDKD.skjkasdkd(lst));
    }
}