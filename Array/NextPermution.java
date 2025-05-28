public class NextPermution {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 7, 5, 0 };
        nextPermutation(arr);
        for (int i : arr) {
            System.out.print(i + " ,");
        }
    }

    private static void nextPermutation(int[] arr) {
        int start = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                start = i;
                break;
            }
        }
        if (start == -1) {
            reverse(arr, 0, arr.length - 1);
            return;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > arr[start]) {
                swap(arr, start, i);
                break;

            }
        }
        reverse(arr, start + 1, arr.length - 1);
    }

    private static void reverse(int[] arr, int start, int i) {
        while (start < i) {
            swap(arr, start, i);
            start++;
            i--;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
