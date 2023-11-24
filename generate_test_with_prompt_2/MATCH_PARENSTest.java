package humaneval;

import static org.junit.jupiter.api.Assertions.*;

class MATCH_PARENSTest {
    @Test
    void humaneval.correct.MATCH_PARENS.check_shouldReturnTrueWhenStringIsBalanced() {
        String input = "()";
        assertTrue(MATCH_PARENS.check(input));
    }

    @Test
    void humaneval.correct.MATCH_PARENS.check_shouldReturnFalseWhenStringIsNotBalanced() {
        String input = ")(";
        assertFalse(MATCH_PARENS.check(input));
    }
}
