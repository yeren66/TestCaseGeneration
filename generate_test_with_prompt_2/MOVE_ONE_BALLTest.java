package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class MOVE_ONE_BALLTest {
    @Test
    public void moveOneBall() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        assertTrue(MOVE_ONE_BALL.move_one_ball(arr));
        
        arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        assertFalse(MOVE_ONE_BALL.move_one_ball(arr));
    }
}