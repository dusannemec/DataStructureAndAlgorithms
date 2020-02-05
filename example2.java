/*
 *  Module 1 | Basic Algorithms
 *  Linear Search
 */


public class example2 {
    public static void linearSearch(int [] lst, int v) {
        int lgth = lst.length;
        for (int i = 0; i < lgth; i++) {
            if (v == lst[i]) {
                System.out.println("Found! It is at " + i);
                return;
            }
        }
        System.out.println("The element is not in the array");

    }

    public static void main(String [] args) {
        int [] nums = {1,2,3,4,5,6};

        linearSearch(nums, 3);
        linearSearch(nums, 7);
    }
}
