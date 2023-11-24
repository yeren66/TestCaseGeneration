package humaneval;

import org.junit.Assert;
import org.junit.Test;

public class SOLVETest {
  @Test
  public void testSumOfDigits() {
    Assert.assertEquals(SOLVE.solve(1000), "1");
    Assert.assertEquals(SOLVE.solve(150), "110");
    Assert.assertEquals(SOLVE.solve(147), "1100");
  }
}
