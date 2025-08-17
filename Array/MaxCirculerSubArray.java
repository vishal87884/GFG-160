
public class MaxCirculerSubArray {
    public static void main(String[] args) {
        int arr[] = { -1, 40, -14, 7, 6, 5, -4, -1 };
        int res = findMaxCirculerSubArray(arr);
        System.out.println(res);
    }

    private static int findMaxCirculerSubArray(int[] arr) {
        int res = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                res = Math.max(sum, res);
                if (sum < 0) {
                    sum = 0;
                }
            }
            for (int j = 0; j < i; j++) {
                sum += arr[j];
                res = Math.max(sum, res);
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return res;

    }

    private static int findMaxCircularSubArray(int[] arr) {
        int totalSum = 0;
        int maxSum = arr[0], currMax = 0;
        int minSum = arr[0], currMin = 0;

        for (int num : arr) {
            totalSum += num;

            // Kadane's for max subarray sum
            currMax = Math.max(num, currMax + num);
            maxSum = Math.max(maxSum, currMax);

            // Kadane's for min subarray sum
            currMin = Math.min(num, currMin + num);
            minSum = Math.min(minSum, currMin);
        }

        // Handle case when all elements are negative
        if (maxSum < 0)
            return maxSum;

        return Math.max(maxSum, totalSum - minSum);
    }
}