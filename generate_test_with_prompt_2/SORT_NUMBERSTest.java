package humaneval;
import static org.junit.Assert.*;
import org.junit.Test;

public class SORT_NUMBERSTest {
    @Test
    public void testSortNumbers() {
        String numbers = "two three one";
        String expectedResult = "one two three";
        assertEquals(expectedResult, humaneval.correct.SORT_NUMBERS.sort_numbers(numbers));
    }
}