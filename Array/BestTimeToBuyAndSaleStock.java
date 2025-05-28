public class BestTimeToBuyAndSaleStock {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 2, 2, 4 };
        int res = findStock(arr);
        System.out.println(res);
    }

    private static int findStock(int[] arr) {
        int res = 0;
        int buy = 0;
        for (int i = 0; i < arr.length-1; i++) {
            buy=Math.min(arr[i], buy);
            if (arr[i] > arr[i + 1]) {
                res += arr[i] - buy;
                buy = 0;
            }
        }
        return res;
    }
}
