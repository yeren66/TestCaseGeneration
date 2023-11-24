package humaneval;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SKJKASDKDTest {
    @Test
    public void testIsPrime() {
        assertTrue(SKJKASDKD.is_prime(2));
        assertFalse(SKJKASDKD.is_prime(15));
        assertTrue(SKJKASDKD.is_prime(79));
    }
}