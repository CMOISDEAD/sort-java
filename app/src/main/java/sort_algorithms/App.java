package sort_algorithms;

import sort_algorithms.Sort.*;
import sort_algorithms.Utils.*;

public class App {

    public static void main(String[] args) {
        Utils utils = new Utils();

        /*
         * Example of usage of sort algorithms
         * - Quick sort
         * - Merge sort
         * - Tim sort
         * - Radix sort
         * ...
         */
        Quick sort = new Quick();

        int[] arr = utils.swap_array(10);
        utils.print_array(arr);
        sort.execute(arr);
        utils.print_array(arr);
    }
}
