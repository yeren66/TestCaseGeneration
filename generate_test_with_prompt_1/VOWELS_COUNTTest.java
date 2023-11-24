package humaneval;

import static org.junit.jupiter.api.Assertions.*;

class VOWELS_COUNTTest {
    @Test
    void testVowelsCount() {
        assertEquals(0, humaneval.correct.VOWELS_COUNT.vowels_count(""));
        assertEquals(1, humaneval.correct.VOWELS_COUNT.vowels_count("a"));
        assertEquals(2, humaneval.correct.VOWELS_COUNT.vowels_count("ae"));
        assertEquals(3, humaneval.correct.VOWELS_COUNT.vowels_count("abcde"));
        assertEquals(4, humaneval.correct.VOWELS_COUNT.vowels_count("ACEDY"));
    }
}