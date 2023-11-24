package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.SKJKASDKD;

public class SKJKASDKDTest {
    @Test
    public void is_primeTEST() {
        int[] testCase = new int[] {0,3,2,1,3,5,7,4,5,5,5,2,181,32,4,32,3,2,32,324,4,3};
        
        for (int i = 0; i < testCase.length; i++) {
            if (!SKJKASDKD.is_prime(testCase[i])) {
                continue;
            }
            
            // If the integer is prime, then it should be included in the list
            int max = SKJKASDKD.skjkasdkd(testCase);
            System.out.println("Max: " + max);
        }
    }
}