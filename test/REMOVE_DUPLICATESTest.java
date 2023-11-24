package humaneval;
import java.util.List;
import java.util.Arrays;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.REMOVE_DUPLICATES;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class REMOVE_DUPLICATESTest {
    @Test
    public void remove_duplicatesTEST() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        List<Integer> result = REMOVE_DUPLICATES.remove_duplicates(numbers);

        assertEquals(result, new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
    }
}