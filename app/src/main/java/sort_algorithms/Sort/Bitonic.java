package sort_algorithms.Sort;

import sort_algorithms.Utils.Utils;

public class Bitonic {
  public int[] execute(int[] arr) {
    long start = System.currentTimeMillis();
    bitonicSort(arr, 0, arr.length, 1);
    long end = System.currentTimeMillis();
    new Utils().print_execution_time(start, end);
    return arr;
  }

  private void exchange(int a[], int i, int j, int d) {
    int temp;
    if ((a[i] > a[j] && d == 1) || (a[i] < a[j] && d == 0)) {
      temp = a[i];
      a[i] = a[j];
      a[j] = temp;
    }
  }

  private void merge(int a[], int beg, int c, int d) {
    int k, i;
    if (c > 1) {
      k = c / 2;
      for (i = beg; i < beg + k; i++)
        exchange(a, i, i + k, d);
      merge(a, beg, k, d);
      merge(a, beg + k, k, d);
    }
  }

  private void bitonicSort(int a[], int beg, int c, int d) {
    int k;
    if (c > 1) {
      k = c / 2;
      bitonicSort(a, beg, k, 1); // sort in ascending order
      bitonicSort(a, beg + k, k, 0); // sort in descending order
      merge(a, beg, c, d); // merge the sequence in ascending order
    }
  }
}
