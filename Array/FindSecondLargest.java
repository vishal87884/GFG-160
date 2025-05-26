public class FindSecondLargest {
    public static void main(String[] args) {
        int arr[] = { 12, 35, 1, 10, 34, 1 };
        int res = checkSecondLargest(arr);
        System.out.println(res);
    }

    private static int checkSecondLargest(int[] arr) {
        int sec = Integer.MIN_VALUE, max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                sec = max;
                max = arr[i];
            } else if (sec < arr[i] && max != arr[i]) {
               sec=arr[i];
            }
        }
        return sec;
    }
}