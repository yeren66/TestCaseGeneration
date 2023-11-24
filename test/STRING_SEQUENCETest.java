package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.STRING_SEQUENCE;

public class STRING_SEQUENCETest {
    @Test
    public void string_sequenceTEST() {
        // Arrange
        int n = 5;
        String expectedResult = "0 1 2 3 4";

        // Act
        String actualResult = STRING_SEQUENCE.string_sequence(n);

        // Assert
        assertEquals(expectedResult, actualResult);
    }
}