package sort_algorithms.Sort;

import sort_algorithms.Utils.Utils;

public class Radix {
  public int[] execute(int[] arr) {
    long start = System.currentTimeMillis();
    radixsort(arr, arr.length);
    long end = System.currentTimeMillis();
    new Utils().print_execution_time(start, end);
    return arr;
  }

  private int getMax(int a[], int n) {
    int max = a[0];
    for (int i = 1; i < n; i++) {
      if (a[i] > max)
        max = a[i];
    }
    return max; // maximum element from the array
  }

  // function to implement counting
  private void countingSort(int a[], int n, int place) {
    int[] output = new int[n + 1];
    int[] count = new int[10];

    // Calculate count of elements
    for (int i = 0; i < n; i++)
      count[(a[i] / place) % 10]++;

    // Calculate cumulative frequency
    for (int i = 1; i < 10; i++)
      count[i] += count[i - 1];

    // Place the elements in sorted order
    for (int i = n - 1; i >= 0; i--) {
      output[count[(a[i] / place) % 10] - 1] = a[i];
      count[(a[i] / place) % 10]--;
    }

    for (int i = 0; i < n; i++)
      a[i] = output[i];
  }

  // function to implement radix sort
  private void radixsort(int a[], int n) {
    // get maximum element from array
    int max = getMax(a, n);

    // Apply counting sort to sort elements based on place value
    for (int place = 1; max / place > 0; place *= 10)
      countingSort(a, n, place);
  }
}
