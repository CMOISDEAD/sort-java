package sort_algorithms;

import sort_algorithms.Sort.*;
import sort_algorithms.Utils.*;

public class App {

    public static void main(String[] args) {
        Utils utils = new Utils();

        Quick sort = new Quick();
        // Merge sort = new Merge();
        // Heap sort = new Heap();
        // Bucket sort = new Bucket();

        int[] arr = utils.random_array(10000000);
        sort.execute(arr);
    }
}
