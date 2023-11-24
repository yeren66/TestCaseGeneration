package humaneval;

import static org.junit.Assert.*;
import org.junit.Test;

public class BY_LENGTHTest {
  @Test
  public void testByLength() {
    ArrayList<Integer> arr = new ArrayList<>();
    assertEquals(0, humaneval.correct.BY_LENGTH.by_length(arr).size());
  }
  
  @Test
  public void testByLengthWithOneElement() {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(1);
    assertEquals(1, humaneval.correct.BY_LENGTH.by_length(arr).size());
  }
  
  @Test
  public void testByLengthWithMultipleElements() {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(2);
    arr.add(1);
    arr.add(4);
    assertEquals(3, humaneval.correct.BY_LENGTH.by_length(arr).size());
  }
  
  @Test
  public void testByLengthWithEmptyArray() {
    ArrayList<Integer> arr = new ArrayList<>();
    assertEquals(0, humaneval.correct.BY_LENGTH.by_length(arr).size());
  }
  
  @Test
  public void testByLengthWithStrangeNumber() {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(-1);
    assertEquals(0, humaneval.correct.BY_LENGTH.by_length(arr).size());
  }
}
