
package humaneval;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ORDER_BY_POINTSTest {
    private final ArrayList<Integer> testCases = new ArrayList<>();
    
    @Before
    public void setUp() {
        testCases.add(new Integer[] {1, 11, -1, -11, -12}); // expected result: [-1, -11, 1, -12, 11]
        testCases.add(new Integer[] {}); // expected result: []
    }
    
    @Test
    public void testOrderByPoints() {
        for (int i = 0; i < testCases.size(); i++) {
            Integer[] nums = testCases.get(i);
            ArrayList<Integer> digits = new ArrayList<>();
            HashMap<Integer, ArrayList<Integer>> digits_number = new HashMap<>();
            
            for (int j = 0; j < nums.length; j++) {
                int neg = 1;
                int n = nums[j];
                if (n < 0) {
                    n = -1 * n;
                    neg = -1;
                }
                int digit = 0;
                for (int k = 0; k < (n + "").toCharArray().length; k++) {
                    if (k == 0)
                        digit += ((n + "").toCharArray()[k] - '0') * neg;
                    else 
                        digit += (n + "").toCharArray()[k] - '0';
                }
                if (! digits.contains(digit))
                    digits.add(digit);
                if (! digits_number.containsKey(digit))
                    digits_number.put(digit, new ArrayList<Integer>());
                digits_number.get(digit).add(nums[j]);
            }
            
            Collections.sort(digits);
            
            ArrayList<Integer> result = new ArrayList<>();
            for (int j = 0; j < digits.size(); j++) {
                result.addAll(digits_number.get(digits.get(j)));
            }
            
            assertArrayEquals(result.toArray(), testCases.get(i));
        }
    }
}
