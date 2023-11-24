package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class MODPTest {
    @Test
    public void modpTEST() {
        int n = 3;
        int p = 5;
        assertEquals(3, modp(n, p));
        
        n = 1101;
        p = 101;
        assertEquals(2, modp(n, p));
        
        n = 0;
        p = 101;
        assertEquals(1, modp(n, p));
        
        n = 3;
        p = 11;
        assertEquals(8, modp(n, p));
    }
}