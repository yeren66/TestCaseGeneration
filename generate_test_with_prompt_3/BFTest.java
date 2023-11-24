package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

public class BFTest {
    @Test
    public void bfTEST() {
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Saturn", "Uranus"));
        assertEquals(expected, BF.bf("Jupiter", "Neptune"));

        expected = new ArrayList<>(Arrays.asList("Venus"));
        assertEquals(expected, BF.bf("Earth", "Mercury"));

        expected = new ArrayList<>(Arrays.asList("Venus", "Earth", "Mars", "Jupiter", "Saturn"));
        assertEquals(expected, BF.bf("Mercury", "Uranus"));
    }
}