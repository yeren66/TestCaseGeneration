
package humaneval.correct;

import org.junit.Assert;
import org.junit.Test;

public class HEX_KEYTest {
    @Test
    public void hex_keyTEST() {
        Assert.assertEquals(HEX_KEY.hex_key("AB"), 1);
        Assert.assertEquals(HEX_KEY.hex_key("1077E"), 2);
        Assert.assertEquals(HEX_KEY.hex_key("ABED1A33"), 4);
        Assert.assertEquals(HEX_KEY.hex_key("123456789ABCDEF0"), 6);
        Assert.assertEquals(HEX_KEY.hex_key("2020"), 2);
    }
}
