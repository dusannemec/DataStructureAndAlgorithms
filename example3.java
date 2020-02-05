import java.util.Arrays;

public class example3 {
    public static int[] bubbleSort(int[] lst) {
        int swaps, tmp, min;
        do {
            swaps = 0;
            for (int i = 0; i < lst.length; i++) {
                if(i+1 != lst.length) {
                    if (lst[i+1] < lst[i]) {
                        min = lst[i+1];
                        tmp = lst[i];
                        lst[i] = min;
                        lst[i+1] = tmp;
                        swaps++;
                    }
                }
            }
        } while (swaps !=0);

        return lst;
    }

    public static void main(String [] args) {
        int[] nums = {4,9,7,1,3,6,5};
        nums = bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
