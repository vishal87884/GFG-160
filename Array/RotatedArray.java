public class RotatedArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        rotate(arr, 2);
        for (int i : arr) {
            System.out.print(i + " ,");
        }
    }

    private static void rotate(int[] arr, int d) {
        int arr2[] = new int[arr.length];
        d = d % arr.length;
        int count = 0;
        for (int i = d; i < arr2.length; i++) {
            arr[count++] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            if (count < arr.length) {
                arr[count++] = arr2[i];
            }
        }
    }
}
