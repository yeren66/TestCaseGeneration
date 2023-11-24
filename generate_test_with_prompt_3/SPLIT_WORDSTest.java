package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;
public class SPLIT_WORDSTest{
@Test
 public void split_wordsTEST(){
  String[] testCase1 = {"Hello", "world!"};
  assertArrayEquals(testCase1,SPLIT_WORDS.split_words("Hello world!"));
  
String[] testCase2 = {"Hello", "world!"};
assertArrayEquals(testCase2, SPLIT_WORDS.split_words("Hello,world!"));
  int count = 3;
 assertTrue(SPLIT_WORDS.split_words("abcdef") == count);
 }
}