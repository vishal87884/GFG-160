import java.util.Arrays;

public class CountPairOfGivenSum {
    public static void main(String[] args) {
        int arr[] = { -1, 1, 5, 5, 7 };
        int res = find(arr, 6);
        System.out.println(res);
    }

    private static int find(int[] arr, int i) {
        int res = 0;
        Arrays.sort(arr);
        int s = 0, e = arr.length - 1;
        while (s < e) {
            if (arr[s] + arr[e] == i) {
                int count1 = 0;
                int count2 = 0;
                int ele1 = arr[s];
                int ele2 = arr[e];
                while (s <= e && ele1 == arr[s]) {
                    s++;
                    count1++;
                }
                while (s <= e && ele2 == arr[e]) {
                    e--;
                    count2++;
                }
                if (ele1 == ele2)
                    res += count1 * (count1-1)/2;
                else
                    res += (count2 * count1) ;
            } else if (arr[s] + arr[e] > i)
                e--;
            else
                s++;
        }
        return res;
    }
}
