package humaneval;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class COUNT_DISTINCT_CHARACTERSTest {
    @Test
    void testCountDistinctCharacters() {
        String inputString = "abcd";
        int expectedResult = 4;
        
        assertEquals(expectedResult, humaneval.correct.COUNT_DISTINCT_CHARACTERS.count_distinct_characters(inputString));
    }
}