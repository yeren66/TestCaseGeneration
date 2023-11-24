package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class INTERSECTIONTest {
    @Test
    public void testIntersection() {
        int[] interval1 = new int[]{1, 2};
        int[] interval2 = new int[]{2, 3};
        assertEquals("NO", INTERSECTION.intersection(interval1, interval2));
    }
    
    @Test
    public void testIntersectionWithNoOverlap() {
        int[] interval1 = new int[]{1, 2};
        int[] interval2 = new int[]{3, 4};
        assertEquals("NO", INTERSECTION.intersection(interval1, interval2));
    }
    
    @Test
    public void testIntersectionWithOverlap() {
        int[] interval1 = new int[]{-3, -1};
        int[] interval2 = new int[]{0, 5};
        assertEquals("YES", INTERSECTION.intersection(interval1, interval2));
    }
}