package Recursion_And_Backtraking;

import java.util.ArrayList;
import java.util.List;

public class FindTheSubSequenceSumIsK {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 1 };
        int k = 2;
        // List<List<Integer>> list = findTheList(arr, k);
        // for (List<Integer> list2 : list) {
        //     System.out.println(list2);
        // }
        System.out.println(countTheAllSubSequence(arr, k, 0, arr.length, new ArrayList<>()));
    }

    private static List<List<Integer>> findTheList(int[] arr, int k) {
        List<List<Integer>> list = new ArrayList<>();
        generate(list, arr, k, 0, arr.length, new ArrayList<>());
        return list;
    }

    private static boolean generate(List<List<Integer>> list, int[] arr, int k, int index, int n,
            ArrayList<Integer> res) {
        if (index >= n) {
            int sum = 0;
            for (Integer integer : res) {
                sum += integer;
            }
            if (sum == k) {
                list.add(new ArrayList<>(res));
                return true;
            }
            return false;
        }
        res.add(arr[index]);
        if (generate(list, arr, k, index + 1, n, res)) {
            return true;
        }
        res.remove(res.size() - 1);
        if (generate(list, arr, k, index + 1, n, res)) {
            return true;
        }
        return false;
    }

    private static int countTheAllSubSequence(int[] arr, int k, int index, int n, ArrayList<Integer> res) {
        if (index >= n) {
            int sum = 0;
            for (Integer integer : res) {
                sum += integer;
            }
            if (sum == k) {
                return (sum == k) ? 1 : 0;
            }
            return 0;
        }
        res.add(arr[index]);
        int l = countTheAllSubSequence(arr, k, index + 1, n, res);
        res.remove(res.size() - 1);
        int r = countTheAllSubSequence(arr, k, index + 1, n, res);
        return l + r;
    }
}
