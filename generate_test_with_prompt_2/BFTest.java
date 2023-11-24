package humaneval;
import static org.junit.jupiter.api.Assertions.*;

class BFTest {
    @Test
    void testBF() {
        // Test case 1: "Jupiter", "Neptune" => ("Saturn", "Uranus")
        String planet1 = "Jupiter";
        String planet2 = "Neptune";
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Saturn", "Uranus"));
        assertEquals(expected, humaneval.correct.BF.bf(planet1, planet2));
        
        // Test case 2: "Earth", "Mercury" => ("Venus")
        String planet3 = "Earth";
        String planet4 = "Mercury";
        ArrayList<String> expected2 = new ArrayList<>(Arrays.asList("Venus"));
        assertEquals(expected2, humaneval.correct.BF.bf(planet3, planet4));
        
        // Test case 3: "Mercury", "Uranus" => ("Venus", "Earth", "Mars", "Jupiter", "Saturn")
        String planet5 = "Mercury";
        String planet6 = "Uranus";
        ArrayList<String> expected3 = new ArrayList<>(Arrays.asList("Venus", "Earth", "Mars", "Jupiter", "Saturn"));
        assertEquals(expected3, humaneval.correct.BF.bf(planet5, planet6));
    }
}