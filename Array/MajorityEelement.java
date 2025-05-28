import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class MajorityEelement {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6 };
        List<Integer> res = findElement(arr);
        System.out.println(res);
    }

    private static List<Integer> findElement(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<Integer> al = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        for (Entry<Integer, Integer> i : hm.entrySet()) {
            if (i.getValue() > n / 3) {
                al.add(i.getKey());
            }
        }
        return al;
    }
}
