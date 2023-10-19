package sort_algorithms.Sort;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import sort_algorithms.Utils.Utils;

public class Bucket {
  private static void bucketSort(int[] array, int bucketSize) {
    // creating a list of buckets for storing lists
    @SuppressWarnings("unchecked")
    List<Integer>[] buckets = new List[bucketSize];
    // Linked list with each bucket array index
    // as there may be hash collision
    for (int i = 0; i < bucketSize; i++) {
      buckets[i] = new LinkedList<>();
    }
    // calculate the hash and assigns elements to the proper bucket
    for (int num : array) {
      buckets[hash(num, bucketSize)].add(num);
    }
    // iterate over the buckets and sorts the elements
    for (List<Integer> bucket : buckets) {
      // sorts the bucket
      Collections.sort(bucket);
    }
    int index = 0;
    // gethered the buckets after sorting
    for (List<Integer> bucket : buckets) {
      for (int num : bucket) {
        array[index++] = num;
      }
    }
  }

  // distributing elements
  private static int hash(int num, int bucketSize) {
    return num / bucketSize;
  }

  public int[] execute(int[] arr) {
    long start = System.currentTimeMillis();
    bucketSort(arr, arr.length);
    long end = System.currentTimeMillis();
    new Utils().print_execution_time(start, end);
    return arr;
  }
}
