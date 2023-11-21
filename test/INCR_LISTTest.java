package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class INCR_LISTTest {
  @Test
  public void testIncrList() {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    List<Integer> result = humaneval.correct.INCR_LIST.incr_list(list);
    assertEquals(Arrays.asList(2, 3, 4), result);
  }
}