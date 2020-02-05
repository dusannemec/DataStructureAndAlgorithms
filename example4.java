/*
 *  Module 2 | Algorithmic Analysis
 *  Merge Sort
 */


import java.util.Arrays;

public class example4 {

    public static int[] mergeSort(int [] lst) {
        int n = lst.length;
        int[] left;
        int[] right;

        // create space for left and riht subarrays
        if (n % 2 == 0) {
            left = new int[n/2];
            right = new int[n/2];
        } else {
            left = new int[n/2];
            right = new int[n/2+1];
        }

        // fill up left and right subarrays
        for (int i = 0; i < n; i++) {
            if (i < n/2) {
                left[i] = lst[i];
            } else {
                right[i-n/2] = lst[i];
            }
        }

        // recursively split and merge
        left = mergeSort(left);
        right = mergeSort(right);

        // merge
        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        // create  space for the merged array
        int[] result = new int[left.length + right.length];

        // running indices
        int i = 0;
        int j = 0;
        int index = 0;

        // add until one subarray is deplete
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[index++] = left[i++];
            } else {
                result[index++] = right[j++];
            }
        }

        // add every leftover element from subarray
        while (i < left.length) {
            result[index++] = left[i++];
        }

        // only one of these two while loops will be executed
        while (j < right.length) {
            result[index++] = right[j++];
        }

        return result;
    }

    public static void main(String [] args) {
        int [] array = {4, 9, 7, 8};

        array = mergeSort(array);

        System.out.println(Arrays.toString(array));
    }
}
