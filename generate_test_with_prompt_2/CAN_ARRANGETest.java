package humaneval;

public class CAN_ARRANGETest {
    @Test
    public void testCanArrange() {
        int[] arr = new int[]{1,2,4,3,5};
        assertEquals(3, humaneval.correct.CAN_ARRANGE.can_arrange(arr));
        
        arr = new int[]{1,2,3};
        assertEquals(-1, humaneval.correct.CAN_ARRANGE.can_arrange(arr));
    }
}