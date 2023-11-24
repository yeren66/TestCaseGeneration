package humaneval.correct;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class SELECT_WORDS {
    public static ArrayList<String> select_words(String s, int n) {
        ArrayList<String> result = new ArrayList<>();
        String[] words = s.split(" ");
        for(int i = 0; i < words.length; i++) {
            int num_consonants = 0;
            char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
            for(int j = 0; j < words[i].length(); j++) {
                boolean consonant = true;
                for(int k = 0; k < vowels.length; k++) {
                    if(vowels[k] == words[i].charAt(j)) {
                        consonant = false;
                        break;
                    }
                }
                if(consonant) num_consonants++;
            }
            if(num_consonants == n) result.add(words[i]);
        }
        return result;
    }
}

public class SELECT_WORDS {
    public static ArrayList<String> select_words(String s, int n) {
        ArrayList<String> result = new ArrayList<>();
        String[] words = s.split(" ");
        for(int i = 0; i < words.length; i++) {
            int num_consonants = 0;
            char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
            for(int j = 0; j < words[i].length(); j++) {
                boolean consonant = true;
                for(int k = 0; k < vowels.length; k++) {
                    if(vowels[k] == words[i].charAt(j)) {
                        consonant = false;
                        break;
                    }
                }
                if(consonant) num_consonants++;
            }
            if(num_consonants == n) result.add(words[i]);
        }
        return result;
    }
}



public class SELECT_WORDSTest {
    @Test
    public void select_wordsTEST() {
        ArrayList<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("little");
        assertEquals(expectedOutput,SELECT_WORDS.select_words("Mary had a little lamb", 4));
        
        ArrayList<String> expectedOutput2 = new ArrayList<>();
        expectedOutput2.add("Mary");
        expectedOutput2.add("lamb");
        assertEquals(expectedOutput2,SELECT_WORDS.select_words("Mary had a little lamb", 3));
        
        ArrayList<String> expectedOutput3 = new ArrayList<>();
        expectedOutput3.add();
        assertEquals(expectedOutput3,SELECT_WORDS.select_words("simple white space", 2));
        
        ArrayList<String> expectedOutput4 = new ArrayList<>();
        expectedOutput4.add("world");
        assertEquals(expectedOutput4,SELECT_WORDS.select_words("Hello world", 4));
        
        ArrayList<String> expectedOutput5 = new ArrayList<>();
        expectedOutput5.add("Uncle");
        assertEquals(expectedOutput5,SELECT_WORDS.select_words("Uncle sam", 3));
    }
}