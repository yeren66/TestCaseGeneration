package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.UNIQUE;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UNIQUETest {
    @Test
    public void uniqueTEST() {
        // Test for an empty list
        List<Integer> input = new ArrayList<>();
        List<Integer> expectedOutput = Collections.emptyList();
        assertEquals(expectedOutput, UNIQUE.unique(input));

        // Test for a single element list
        input = new ArrayList<>();
        input.add(1);
        expectedOutput = Collections.singletonList(1);
        assertEquals(expectedOutput, UNIQUE.unique(input));

        // Test for a multi-element list with duplicates
        input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(2);
        expectedOutput = Collections.singletonList(1, 2, 3);
        assertEquals(expectedOutput, UNIQUE.unique(input));
    }
}