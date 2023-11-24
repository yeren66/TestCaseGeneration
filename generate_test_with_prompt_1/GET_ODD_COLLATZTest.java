package humaneval;

import static org.junit.Assert.*;

public class GET_ODD_COLLATZTest {

  @Test
  public void testGetOddCollatz() {
    // Test case 1
    int n = 5;
    ArrayList<Integer> expected = new ArrayList<>();
    expected.add(1);
    expected.add(5);
    assertEquals(expected, humaneval.correct.GET_ODD_COLLATZ.get_odd_collatz(n));

    // Test case 2
    n = 7;
    expected = new ArrayList<>();
    expected.add(7);
    assertEquals(expected, humaneval.correct.GET_ODD_COLLATZ.get_odd_collatz(n));

    // Test case 3
    n = 10;
    expected = new ArrayList<>();
    expected.add(9);
    expected.add(11);
    assertEquals(expected, humaneval.correct.GET_ODD_COLLATZ.get_odd_collatz(n));

    // Test case 4
    n = 20;
    expected = new ArrayList<>();
    expected.add(19);
    expected.add(23);
    assertEquals(expected, humaneval.correct.GET_ODD_COLLATZ.get_odd_collatz(n));
  }
}
