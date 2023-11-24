package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.BY_LENGTH;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class BY_LENGTHTest {
    @Test
    public void by_lengthTEST() {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(2);
        input.add(1);
        input.add(1);
        input.add(4);
        input.add(5);
        input.add(8);
        input.add(2);
        input.add(3);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Eight");
        expected.add("Five");
        expected.add("Four");
        expected.add("Three");
        expected.add("Two");
        expected.add("Two");
        expected.add("One");
        expected.add("One");
        assertEquals(expected, BY_LENGTH.by_length(input));
    }
}