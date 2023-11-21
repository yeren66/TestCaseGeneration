package humaneval;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MOVE_ONE_BALLTest {
    @Test
    public void testMoveOneBall() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        assertTrue(MOVE_ONE_BALL.move_one_ball(arr));
    }
}