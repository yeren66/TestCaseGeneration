package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.SORT_NUMBERS;
import java.util.*;

public class SORT_NUMBERSTest {
    @Test
    public void sort_numbersTEST() {
        String input = "one three seven zero";
        String expectedOutput = "zero one three seven";
        String actualOutput = SORT_NUMBERS.sort_numbers(input);
        assertEquals(expectedOutput, actualOutput);
    }
}