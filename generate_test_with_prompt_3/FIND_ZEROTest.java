
package humaneval;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FIND_ZEROTest {
    @Test
    public void polyTEST() {
        // Arrange
        List<Double> xs = new ArrayList<>();
        xs.add(1.0);
        xs.add(-2.0);
        xs.add(3.0);
        double x = 5.0;

        // Act
        double result = FIND_ZERO.poly(xs, x);

        // Assert
        double expectedResult = -18.0;
        Assert.assertEquals(expectedResult, result, 0.0001);
    }
}