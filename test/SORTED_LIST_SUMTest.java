package humaneval;
import java.util.List;
import org.junit.Test;
import java.util.*;

public class SortedListSum {
    public static ArrayList<String> sortedListSum(ArrayList<String> lst) {
        // Sort the list in ascending order by length of each word
        Collections.sort(lst, (s1, s2) -> s1.length() - s2.length());

        // Create a new list to store the sorted and filtered strings
        ArrayList<String> result = new ArrayList<>();

        // Iterate over the original list and add only the strings with even length to the result list
        for (String str : lst) {
            if (str.length() % 2 == 0) {
                result.add(str);
            }
        }

        return result;
    }
}