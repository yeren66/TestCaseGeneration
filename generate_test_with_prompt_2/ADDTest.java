package humaneval;

import static org.junit.jupiter.api.Assertions.*;

public class ADDTest {
    private final int x = 2;
    private final int y = 3;

    @Test
    public void testAdd() {
        assertEquals(5, humaneval.correct.ADD.add(x, y));
    }
}