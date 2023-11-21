package humaneval;
import static org.junit.Assert.*;
import org.junit.Test;

public class WORDS_STRINGSTest {
  
  @Test
  public void testWordsString() {
    String s = "Hi, my name is John";
    ArrayList<String> expected = new ArrayList<>();
    expected.add("Hi");
    expected.add("my");
    expected.add("name");
    expected.add("is");
    expected.add("John");
    
    assertEquals(expected, humaneval.correct.WORDS_STRINGS.words_strings(s));
  }
  
  @Test
  public void testWordsStringWithCommas() {
    String s = "One, two, three, four, five, six";
    ArrayList<String> expected = new ArrayList<>();
    expected.add("One");
    expected.add("two");
    expected.add("three");
    expected.add("four");
    expected.add("five");
    expected.add("six");
    
    assertEquals(expected, humaneval.correct.WORDS_STRINGS.words_strings(s));
  }
  
  @Test
  public void testWordsStringWithMixedDelimiters() {
    String s = "One two three four five six";
    ArrayList<String> expected = new ArrayList<>();
    expected.add("One");
    expected.add("two");
    expected.add("three");
    expected.add("four");
    expected.add("five");
    expected.add("six");
    
    assertEquals(expected, humaneval.correct.WORDS_STRINGS.words_strings(s));
  }
  
  @Test
  public void testWordsStringWithEmptyInput() {
    String s = "";
    ArrayList<String> expected = new ArrayList<>();
    
    assertEquals(expected, humaneval.correct.WORDS_STRINGS.words_strings(s));
  }
}