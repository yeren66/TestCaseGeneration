package humaneval;
import org.junit.Assert;
import org.junit.Test;

public class ENCRYPTTest {
    @Test
    public void humaneval.correct.ENCRYPT.encrypt_emptyString() {
        Assert.assertEquals("", humaneval.correct.ENCRYPT.encrypt(""));
    }
    
    @Test
    public void humaneval.correct.ENCRYPT.encrypt_lowercaseLetter() {
        Assert.assertEquals("lm", humaneval.correct.ENCRYPT.encrypt("hi"));
    }
    
    @Test
    public void humaneval.correct.ENCRYPT.encrypt_uppercaseLetter() {
        Assert.assertEquals("LM", humaneval.correct.ENCRYPT.encrypt("HI"));
    }
    
    @Test
    public void humaneval.correct.ENCRYPT.encrypt_mixedCaseLetters() {
        Assert.assertEquals("Lm", humaneval.correct.ENCRYPT.encrypt("Hi"));
    }
    
    @Test
    public void humaneval.correct.ENCRYPT.encrypt_multipleLowercaseLetters() {
        Assert.assertEquals("ewhjklnop", humaneval.correct.ENCRYPT.encrypt("asdfghjkl"));
    }
    
    @Test
    public void humaneval.correct.ENCRYPT.encrypt_multipleUppercaseLetters() {
        Assert.assertEquals("EWHJKLNOP", humaneval.correct.ENCRYPT.encrypt("ASDFGHJKL"));
    }
    
    @Test
    public void humaneval.correct.ENCRYPT.encrypt_mixedCaseLettersAndSpaces() {
        Assert.assertEquals("ewhj knop", humaneval.correct.ENCRYPT.encrypt("asdf ghjk l"));
    }
}