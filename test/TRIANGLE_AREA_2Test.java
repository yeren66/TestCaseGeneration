package humaneval;
import static org.junit.Assert.*;

public class TRIANGLE_AREA_2Test {
  
  @Test
  public void testTriangleAreaWithValidTriangle() {
    assertEquals(6.0, humaneval.correct.TRIANGLE_AREA_2.triangle_area_2(3, 4, 5), 0.01);
  }
  
  @Test
  public void testTriangleAreaWithInvalidTriangle() {
    assertEquals(-1, humaneval.correct.TRIANGLE_AREA_2.triangle_area_2(1, 2, 10), 0.01);
  }
}