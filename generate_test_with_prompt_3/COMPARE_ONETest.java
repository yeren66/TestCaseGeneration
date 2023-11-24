package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;
public class COMPARE_ONETest {
    @Test
    public void compare_oneTEST() {
        assertEquals("2,3", COMPARE_ONE.compare_one(1, "2,3"));
        assertEquals("6", COMPARE_ONE.compare_one("5,1", "6"));
        assertNull(COMPARE_ONE.compare_one("1", 1));
    }
}