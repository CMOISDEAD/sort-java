package sort_algorithms.Utils;

public class Utils {
  /**
   * generate an array with length len
   *
   * @param len length of array
   * @return array
   */
  public int[] gen_array(int len) {
    int[] arr = new int[len];
    for (int i = 0; i < len; i++) {
      arr[i] = i + 1;
    }
    return arr;
  }

  /**
   * generate and array and swap it randomly
   *
   * @param len length of array
   * @return arr array
   */
  public int[] swap_array(int len) {
    int[] arr = gen_array(len);
    for (int i = 0; i < len; i++) {
      int rand = (int) (Math.random() * len);
      int temp = arr[i];
      arr[i] = arr[rand];
      arr[rand] = temp;
    }
    return arr;
  }

  /**
   * generate an array with length len and random number
   *
   * @param len length of array
   * @return array
   */
  public int[] random_array(int len) {
    int[] arr = new int[len];
    for (int i = 0; i < len; i++) {
      arr[i] = (int) (Math.random() * len);
    }
    return arr;
  }

  /**
   * print array
   *
   * @param array array to print
   */
  public void print_array(int[] array) {
    System.out.print("[ ");
    for (int i : array) {
      System.out.print(i + ", ");
    }
    System.out.println(" ]");
  }

  /**
   * print execution time
   *
   * @param start start time
   * @param end   end time
   */
  public void print_execution_time(long start, long end) {
    System.out.println("Time: " + (end - start) + "ms");
  }
}
