package Sorting;

public class CountIntersion {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 3, 5 };
        print(arr);
        int res = countInversions(arr);
        System.out.println();
        print(arr);
        System.out.println();
        System.out.println(res);
    }

    private static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " , ");
        }
    }

    private static int countInversions(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    private static int mergeSort(int[] arr, int i, int length) {
        int res = 0;
        if (i < length) {
            int m = i + (length - i) / 2;
            mergeSort(arr, i, m);
            mergeSort(arr, m + 1, length);
            res += merge(arr, i, m, length);
        }
        return res;
    }

    private static int merge(int[] arr, int l, int m, int r) {
        int res = 0;
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[m + i + 1];
        }
        int k = l;
        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (R[j] >= L[i]) {
                arr[k] = L[i];
                i++;

            } else {
                arr[k] = R[j];
                j++;
                res+=(n1-i);
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        return res;
    }
}
