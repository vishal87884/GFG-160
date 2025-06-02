public class BuyAndSaleStock {
    public static void main(String[] args) {
        int arr[] = {86 ,92, 24 ,5 ,34 ,72, 68 ,52 ,27 ,95, 41 ,28 ,35};
        int res = findTheStock(arr);
        System.out.println(res);
    }

    private static int findTheStock(int[] arr) {
        int n = arr.length;
        int buy = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i < n; i++) {
            buy = Math.min(buy, arr[i]);
            while (i + 1 < n && arr[i] < arr[i + 1]) {
                i++;
            }
            if (arr[i] > buy) {
                res += arr[i] - buy;
                buy = Integer.MAX_VALUE;
            }
        }
        return res;
    }
}
