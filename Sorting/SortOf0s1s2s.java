package Sorting;

public class SortOf0s1s2s {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 0, 1, 2, 0, 1, 2 };
        sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void sort(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
    }

    private static void dutchNationalAlgo(int[] arr) {
        int mid = 0, lo = 0, hi = arr.length - 1;
        while (mid <= hi) {
            if (arr[mid] == 0) {
                swap(arr, lo, mid);
                lo++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, hi);
                hi--;
            }
        }
    }

    private static void swap(int arr[], int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
