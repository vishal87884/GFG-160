package suffix;

import java.util.HashMap;

public class LongestSubarrayWithSum {
    public static void main(String[] args) {
        int arr[] = {94, -33, -13, 40, -82, 94 ,-33, -13, 40, -82 };
        int k = 52;
        int res = findTheSum(arr, k);
        System.out.println(res);
    }

    private static int findTheSum(int[] arr, int k) {
        int n = arr.length;
        int pre[] = new int[n];
        pre[0] = arr[0];
        for (int i = 1; i < n; i++) {
            pre[i] = arr[i] + pre[i - 1];
        }
        for (int i = n - 1; i >= 0; i--) {
            if (pre[i] == k) {
                return i + 1;
            }
        }
        return 0;
    }
    public int longestSubarray(int[] arr, int k) {
        int res=0,pre=0;
        HashMap<Integer ,Integer > hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            pre+=arr[i];
            if(pre==k)
            res= i+1;
            else if(hm.containsKey(pre-k))
            res=Math.max(res ,i - hm.get(pre-k) );
            if(!hm.containsKey(pre)){
                hm.put(pre,i);
            }
            
        }
        return res;
    }
}
