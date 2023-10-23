package sort_algorithms.Sort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SortTest {
  @Test
  void quickTest() {
    int[] arr = { 5, 4, 3, 2, 1 };
    int[] expected = { 1, 2, 3, 4, 5 };
    Quick sort = new Quick();
    sort.execute(arr);
    assertArrayEquals(expected, arr, "Quick sort failed");
  }
}
