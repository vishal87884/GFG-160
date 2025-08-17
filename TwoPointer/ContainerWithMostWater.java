public class ContainerWithMostWater {
    public static void main(String[] args) {
        int arr[]={2, 1, 8, 6, 4, 6, 5, 5};
        int res=findTheContainer(arr);
        System.out.println(res);
    }

    private static int findTheContainer(int[] arr) {
        int s=0,e=arr.length-1,res=0;
        while (s<=e) {
            res=Math.max((e-s)*Math.min(arr[s], arr[e]), res);
            if (arr[s]<=arr[e]) {
                s++;
            }else{
                e--;
            }
        }
        return res;
    }
}
