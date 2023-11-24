package humaneval;

import static org.junit.Assert.*;
import org.junit.Test;

public class CAR_RACE_COLLISIONTest {
    @Test
    public void testCarRaceCollision() {
        int n = 10;
        int expected = 10 * 10;
        
        assertEquals(expected, humaneval.correct.CAR_RACE_COLLISION.car_race_collision(n));
    }
}
