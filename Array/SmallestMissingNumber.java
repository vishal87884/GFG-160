import java.util.HashSet;
import java.util.Set;

public class SmallestMissingNumber {
    public static void main(String[] args) {
        int arr[] = { 2, -3, 4, 1, 1, 7 };
        int res = missingNumber(arr);
        System.out.println(res);

    }

    public static int missingNumber(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (num >= 0) {
                set.add(num);
            }
        }
        int res = 1;
        while (set.contains(res)) {
            res++;
        }

        return res;
    }
}
