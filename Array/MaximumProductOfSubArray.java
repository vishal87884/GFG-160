public class MaximumProductOfSubArray {
    public static void main(String[] args) {
        int[] arr = {-2, 6, -3, -10, 0, 2 };
        int result = maxProduct(arr);
        System.out.println("Maximum product of subarray: " + result);
    }

    private static int maxProduct(int[] arr) {
        int left = 1;
        int right = 1;
        int res = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (right == 0) {
                right = 1;
            }
            if (left == 0) {
                left = 1;
            }
            left *= arr[i];
            right *= arr[n - i - 1];
            res = Math.max(res,Math.max(left, right));
        }
        return res;
    }
}
