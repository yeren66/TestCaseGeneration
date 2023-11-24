package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.SORT_ARRAY_BINARY;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SORT_ARRAY_BINARYTest {
    @Test
    public void number_onesTEST() {
        // Test with positive integers
        assertEquals(0, SORT_ARRAY_BINARY.number_ones(0));
        assertEquals(1, SORT_ARRAY_BINARY.number_ones(1));
        assertEquals(2, SORT_ARRAY_BINARY.number_ones(3));
        assertEquals(4, SORT_ARRAY_BINARY.number_ones(15));
        
        // Test with negative integers
        assertEquals(-1, SORT_ARRAY_BINARY.number_ones(-1));
        assertEquals(-2, SORT_ARRAY_BINARY.number_ones(-3));
        assertEquals(-4, SORT_ARRAY_BINARY.number_ones(-15));
    }
}