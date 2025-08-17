package matrix;

import java.util.ArrayList;

public class TraversalMatrix {
    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11, 12 },
                { 13, 14, 15, 16, 17, 18 },
        };
        ArrayList<Integer> res = traversTheMatrix(mat);
        System.out.println(res);
    }

    private static ArrayList<Integer> traversTheMatrix(int[][] mat) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int m = mat.length;
        int n = mat[0].length;
        int t = 0, l = 0, r = n - 1, b = m - 1;
        while (t <= b && l <= r) {
            for (int i = l; i <= r; i++) {
                arrayList.add(mat[t][i]);
            }
            t++;
            for (int i = t; i <= b; i++) {
                arrayList.add(mat[i][r]);
            }
            r--;
            if (t <= b) {
                for (int i = r; i >= l; i--) {
                    arrayList.add(mat[b][i]);
                }
                b--;
            }
            if (l <= r) {
                for (int i = b; i >= t; i--) {
                    arrayList.add(mat[i][l]);
                }
                l++;
            }
        }
        return arrayList;
    }

}
