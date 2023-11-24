
package humaneval;

import org.junit.Test;

import static org.junit.Assert.*;

public class FLIP_CASETest {

    @Test
    public void flipCase() {
        String input = "Hello World";
        String expectedOutput = "hELLO wORLD";
        assertEquals(expectedOutput, humaneval.correct.FLIP_CASE.flip_case(input));
    }

    @Test
    public void flipCase2() {
        String input = "hello world";
        String expectedOutput = "HELLO WORLD";
        assertEquals(expectedOutput, humaneval.correct.FLIP_CASE.flip_case(input));
    }

    @Test
    public void flipCase3() {
        String input = "";
        String expectedOutput = "";
        assertEquals(expectedOutput, humaneval.correct.FLIP_CASE.flip_case(input));
    }

}