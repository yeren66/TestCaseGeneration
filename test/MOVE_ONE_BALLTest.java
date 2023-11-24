  package humaneval;
import java.util.List;
import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.MOVE_ONE_BALL;
import java.util.ArrayList;
import java.util.Collections;
public class MOVE_ONE_BALLTest {
    @Test
    public void move_one_ballTEST() {
        // Test case 1:
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(4);
        arr.add(5);
        assertTrue(MOVE_ONE_BALL.move_one_ball(arr));
        // Test case 2:
        arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        assertFalse(MOVE_ONE_BALL.move_one_ball(arr));
    }
}