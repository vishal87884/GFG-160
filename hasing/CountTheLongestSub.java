import java.util.Arrays;
import java.util.HashSet;

public class CountTheLongestSub {
    public static void main(String[] args) {
        int arr[] = { 2, 6, 1, 9, 4, 5, 3 };
        int res = find2(arr);
        System.out.println(res);
    }

    private static int find(int[] arr) {
        Arrays.sort(arr);
        int res = 0, temp = arr[0], max = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                if (temp == arr[i]) {
                    temp++;
                    res++;
                } else {
                    temp = arr[i];
                    temp++;
                    res = 1;
                }
                max = Math.max(res, max);
            }
        }
        return res;
    }

    private static int find2(int arr[]) {
        HashSet<Integer> st = new HashSet<>();
        for (Integer integer : arr) {
            st.contains(integer);
        }
        int res = 0;
        for (int value : arr) {
            if (st.contains(value) && !st.contains(value - 1)) {
                int curr = value, cnt = 0;
                while (st.contains(curr)) {
                    st.remove(curr);
                    cnt++;
                    curr++;
                }
                res = Math.max(cnt, res);
            }
        }
        return res;
    }
}
