import java.util.Arrays;

public class MinimizeTheHeight {
    public static void main(String[] args) {
        int arr[] = { 1, 8, 10, 6, 4, 6, 9, 1 };
        int k = 7;
        int res = minimizeHeight(arr, k);
        System.out.println(res);
    }

    private static int minimizeHeight(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        int result = arr[n - 1] - arr[0];

        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;

        for (int i = 1; i < n; i++) {
            int min = Math.min(smallest, arr[i] - k);
            int max = Math.max(largest, arr[i - 1] + k);

            if (min < 0)
                continue; // heights can't be negative

            result = Math.min(result, max - min);
        }

        return result;
    }
}
