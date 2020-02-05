/*
 *  Module 1 | Basic Algorithms
 *  Selection Sort Code
 */

import java.util.Arrays;

public class example1 {
    public static void selectionSort(int [] lst) {
        int min, swap, tmp;
        for (int i = 0; i < lst.length; i++) {
            for (int j = i; j < lst.length; j++) {
                min = lst[i];
                if (lst[j] < min) {
                    min = lst[j];
                    tmp = lst[i];
                    lst[i] = min;
                    lst[j] = tmp;
                }
            }
        }
     }

    public static void main(String [] args) {
        int[] lst = {4, 9, 7, 1, 3, 6, 5};

        selectionSort(lst);
        System.out.println(Arrays.toString(lst));
    }
}
