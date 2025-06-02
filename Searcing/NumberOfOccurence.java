package Searcing;

import java.util.HashMap;

public class NumberOfOccurence {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 3, 4, 5 };
        int target = 2;
        int count = countOccurrences(arr, target);
        System.out.println("Number of occurrences of " + target + ": " + count);
    }

    private static int countOccurrences(int[] arr, int target) {
        int res = 0;
        HashMap<Integer , Integer > hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        return res;
    }

}
