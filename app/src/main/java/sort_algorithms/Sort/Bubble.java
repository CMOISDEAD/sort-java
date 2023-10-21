package sort_algorithms.Sort;

import sort_algorithms.Utils.*;

public class Bubble {
  public int[] execute(int[] arr) {
    long start = System.currentTimeMillis();
    bubbleSortt(arr);
    long end = System.currentTimeMillis();
    new Utils().print_execution_time(start, end);
    return arr;
  }

  private void bubbleSortt(int a[]) {
    int n = a.length;
    int i, j, temp;
    for (i = 0; i < n; i++) {
      for (j = i + 1; j < n; j++) {
        if (a[j] < a[i]) {
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
  }
}
