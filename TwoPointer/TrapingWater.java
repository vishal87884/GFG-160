public class TrapingWater {
    public static void main(String[] args) {
        int arr[] = { 3, 0, 2, 0, 4 };
        int res = find(arr);
        System.out.println(res);
    }

    private static int find(int[] arr) {
        int res = 0;
        int s = 1, e = arr.length - 2;
        int lmax = arr[0], rmax = arr[e + 1];
        while (s <= e) {
            if (lmax <= rmax) {
                lmax = Math.max(lmax, arr[s]);
                res += lmax - arr[s];
                s++;
            } else {
                rmax = Math.max(arr[e], rmax);
                res += rmax - arr[e];
                e--;
            }
        }
        return res;
    }
}
