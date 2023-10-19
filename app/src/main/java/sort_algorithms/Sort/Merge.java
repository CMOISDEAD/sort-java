package sort_algorithms.Sort;

import sort_algorithms.Utils.Utils;

public class Merge {
  public int[] execute(int[] arr) {
    long start = System.currentTimeMillis();
    merge_sort(arr, 0, arr.length - 1);
    long end = System.currentTimeMillis();
    new Utils().print_execution_time(start, end);
    return arr;
  }

  // Merge Sort
  private void merge_sort(int[] arr, int left, int right) {
    if (left < right) {
      int mid = (left + right) / 2;
      merge_sort(arr, left, mid);
      merge_sort(arr, mid + 1, right);
      merge(arr, left, mid, right);
    }
  }

  private void merge(int[] arr, int left, int mid, int right) {
    int[] temp = new int[right - left + 1];
    int i = left;
    int j = mid + 1;
    int k = 0;
    while (i <= mid && j <= right) {
      if (arr[i] < arr[j]) {
        temp[k] = arr[i];
        i++;
      } else {
        temp[k] = arr[j];
        j++;
      }
      k++;
    }
    while (i <= mid) {
      temp[k] = arr[i];
      i++;
      k++;
    }
    while (j <= right) {
      temp[k] = arr[j];
      j++;
      k++;
    }
    for (int m = left; m <= right; m++) {
      arr[m] = temp[m - left];
    }
  }
}
