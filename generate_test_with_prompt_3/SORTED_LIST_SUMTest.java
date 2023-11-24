package humaneval;    

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;

public class SORTED_LIST_SUMTest {
    @Test
    public void sorted_list_sumTEST() {
        // Create an input list with some strings of odd and even lengths
        ArrayList<String> input = new ArrayList<>();
        input.add("hello");
        input.add("hi");
        input.add("world");

        // Call the method under test
        ArrayList<String> output = SORTED_LIST_SUM.sorted_list_sum(input);

        // Verify that the output is correct
        assertEquals(output, Arrays.asList("hi", "hello"));
    }
}