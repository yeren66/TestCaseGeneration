package humaneval;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import humaneval.correct.SORT_NUMBERS;

class SORT_NUMBERSTest {
    private final String[] input = new String[]{
        "zero one two three four five six seven eight nine",
        "nine zero eight seven six five four three two one",
        "three two one zero",
        "eight seven six five four three two one zero"
    };
    
    private final String[] expected = new String[]{
        "zero one two three four five six seven eight nine",
        "nine zero eight seven six five four three two one",
        "one two three zero",
        "eight seven six five four three two one zero"
    };
    
    @Test
    void testSortNumbers() {
        for (int i = 0; i < input.length; i++) {
            String result = humaneval.correct.SORT_NUMBERS.sort_numbers(input[i]);
            assertEquals(expected[i], result);
        }
    }
}
