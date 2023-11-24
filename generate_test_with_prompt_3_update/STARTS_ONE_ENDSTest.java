
package humaneval.correct;
import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.STARTS_ONE_ENDS;

public class STARTS_ONE_ENDSTest {
    @Test
    public void starts_one_endsTEST() {
        int result = STARTS_ONE_ENDS.starts_one_ends(1);
        assertEquals(1, result);
    }
}