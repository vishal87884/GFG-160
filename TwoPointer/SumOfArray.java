import java.util.ArrayList;
import java.util.HashMap;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 7, 5 };
        ArrayList<Integer> al = getRes(arr, 12);
        System.out.println(al);
    }

    private static ArrayList<Integer> getRes(int[] arr, int i) {
        ArrayList<Integer> al = new ArrayList<>();
        int s = 0, e = -1, sum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (sum - i == 0) {
                s = 0;
                e = i;
                break;
            }
            if (hm.containsKey(sum - i)) {
                s = hm.get(sum - i) + 1;
                e = i;
                break;
            }
            hm.put(sum, j);

        }
        if (e == -1) {
            al.add(-1);
            return al;
        }
        al.add(s);
        al.add(e);
        return al;
    }
}
