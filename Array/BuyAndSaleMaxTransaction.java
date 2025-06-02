public class BuyAndSaleMaxTransaction {
    public static void main(String[] args) {
        int arr[] = { 86, 92, 24, 5, 34, 72, 68, 52, 27, 95, 41, 28, 35 };
        int res = findMaxTransaction(arr);
        System.out.println(res);
    }

    private static int findMaxTransaction(int[] arr) {

        int buy = arr[0];
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > buy) {
                res = Math.max(res, arr[i] - buy);
            }
            buy = Math.min(buy, arr[i]);
        }
        return res;
    }

}
