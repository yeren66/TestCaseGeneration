package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class STRLENTest {
  
  @Test
  public void testStrlen() {
    String inputString = "hello";
    int expectedLength = 5;
    
    assertEquals(expectedLength, humaneval.correct.STRLEN.strlen(inputString));
  }
  
  @Test
  public void testEmptyString() {
    String inputString = "";
    int expectedLength = 0;
    
    assertEquals(expectedLength, humaneval.correct.STRLEN.strlen(inputString));
  }
  
  @Test
  public void testNullString() {
    String inputString = null;
    int expectedLength = -1; // or any other appropriate value
    
    assertEquals(expectedLength, humaneval.correct.STRLEN.strlen(inputString));
  }
}
