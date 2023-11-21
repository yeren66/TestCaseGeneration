package humaneval;

import static org.junit.Assert.*;
import org.junit.Test;

public class ENCODETest {
  @Test
  public void testEncode() {
    assertEquals("TGST", humaneval.correct.ENCODE.encode("test"));
    assertEquals("tHKS KS C MGSSCGG", humaneval.correct.ENCODE.encode("This is a message"));
  }
}
