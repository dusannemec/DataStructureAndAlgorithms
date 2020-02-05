public class example5 {
    public static boolean binarySearch(int[] lst, int num, int low, int high) {
        if (low > high) {
            System.out.println("not found");
            return false;
        }

        int middle = (low+high)/2;

        if (num == lst[middle]) {
            System.out.println("Found! It is at " + middle);
            return true;
        }
        else if (num > lst[middle]) {
            return binarySearch(lst, num, middle + 1, high);
        }
        else {
            return binarySearch(lst, num, low, middle - 1);
        }
    }

    public static void main(String [] args) {
        int[] lst = {1, 3, 4, 5, 7, 9, 13, 15, 16, 17, 19, 20};
        int num = 20;
        binarySearch(lst, num, 0, lst.length);
    }
}
