import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = { -4, -3, 2, -5, -10, -7 };
        boolean res = find(arr, -17);
        System.out.println(res);
    }

    private static boolean find(int[] arr, int i) {
        Set<Integer> temp = new HashSet<>();
        for (Integer integer : arr) {        
            if (temp.contains((i-integer))) {
                return true;
            }
            temp.add(integer);
        }
        return false;
    }
}
