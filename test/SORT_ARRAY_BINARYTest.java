package humaneval;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;

public class SORT_ARRAY_BINARYTest {
   @Test
   public void testSortArrayBinary() {
      // Test case 1: [1, 5, 2, 3, 4]
      ArrayList<Integer> arr = new ArrayList<>();
      arr.add(1);
      arr.add(5);
      arr.add(2);
      arr.add(3);
      arr.add(4);
      SORT_ARRAY_BINARY.sort_array_binary(arr);
      assertArrayEquals(new Integer[] { 1, 2, 3, 4, 5 }, arr.toArray());
      
      // Test case 2: [-2, -3, -4, -5, -6]
      ArrayList<Integer> neg_arr = new ArrayList<>();
      neg_arr.add(-2);
      neg_arr.add(-3);
      neg_arr.add(-4);
      neg_arr.add(-5);
      neg_arr.add(-6);
      SORT_ARRAY_BINARY.sort_array_binary(neg_arr);
      assertArrayEquals(new Integer[] { -6, -5, -4, -3, -2 }, neg_arr.toArray());
      
      // Test case 3: [1, 0, 2, 3, 4]
      ArrayList<Integer> mixed_arr = new ArrayList<>();
      mixed_arr.add(1);
      mixed_arr.add(0);
      mixed_arr.add(2);
      mixed_arr.add(3);
      mixed_arr.add(4);
      SORT_ARRAY_BINARY.sort_array_binary(mixed_arr);
      assertArrayEquals(new Integer[] { 0, 1, 2, 3, 4 }, mixed_arr.toArray());
   }
}
