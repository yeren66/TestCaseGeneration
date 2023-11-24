
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class CAR_RACE_COLLISIONTest {
    @Test
    public void car_race_collisionTEST() {
        int n = 10; // number of cars
        int expectedCollisions = n * n; // expected number of collisions (n^2)
        assertEquals(expectedCollisions, CAR_RACE_COLLISION.car_race_collision(n));
    }
}
