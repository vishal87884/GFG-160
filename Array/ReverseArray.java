public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 3, 2, 6, 5 };
        reverseArray(arr);
    }

    public static void reverseArray(int arr[]) {
        int s = 0, e = arr.length - 1;
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
