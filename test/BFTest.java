package humaneval;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;

public class BFTest {
    @Test
    public void testBF() {
        ArrayList<String> result = humaneval.correct.BF.bf("Jupiter", "Neptune");
        assertEquals(2, result.size());
        assertTrue(result.contains("Saturn"));
        assertTrue(result.contains("Uranus"));
    }

    @Test
    public void testBFWithInvalidPlanetName() {
        ArrayList<String> result = humaneval.correct.BF.bf("Earth", "Mercury");
        assertEquals(1, result.size());
        assertTrue(result.contains("Venus"));
    }

    @Test
    public void testBFWithSamePlanetNames() {
        ArrayList<String> result = humaneval.correct.BF.bf("Mercury", "Mercury");
        assertEquals(0, result.size());
    }
}
