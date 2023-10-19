package sort_algorithms.Sort;

import sort_algorithms.Utils.Utils;

public class Quick {

  public int[] execute(int[] arr) {
    long start = System.currentTimeMillis();
    quick_sort(arr, 0, arr.length - 1);
    long end = System.currentTimeMillis();
    new Utils().print_execution_time(start, end);
    return arr;
  }

  // quick sort algorithm
  private void quick_sort(int[] arr, int left, int right) {
    if (left < right) {
      int pivot = partition(arr, left, right);
      quick_sort(arr, left, pivot - 1);
      quick_sort(arr, pivot + 1, right);
    }
  }

  private int partition(int[] arr, int left, int right) {
    int pivot = arr[right];
    int i = left - 1;
    for (int j = left; j < right; j++) {
      if (arr[j] < pivot) {
        i++;
        swap(arr, i, j);
      }
    }
    swap(arr, i + 1, right);
    return i + 1;
  }

  private void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
