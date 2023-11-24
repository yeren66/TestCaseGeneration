package humaneval;
  import org.junit.Assert;
  import humaneval.correct.LARGEST_SMALLEST_INTEGERS;
  
  public class LARGEST_SMALLEST_INTEGERSTest {
    @Test
    public void largest_smallest_integersTEST() {
        int[] lst = new int[]{2, 4, 1, 3, 5, 7};
        int[] result = LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(lst);
        assertArrayEquals(new int[] {0, 1}, result);
    }
  }