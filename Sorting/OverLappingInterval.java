package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OverLappingInterval {
    public static void main(String[] args) {
        int[][] intervals = { { 1, 9 }, { 2, 4 }, { 4, 7 }, { 6, 8 } };
        int res = countOverlappingIntervals(intervals);
        System.out.println(res);
    }

    private static int countOverlappingIntervals(int[][] intervals) {
        int res = 0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int first = intervals[i][0];
            int second = intervals[i][1];
            int j = i + 1;
            while (j < intervals.length && intervals[j][0] < second) {
                j++;
            }
            i = j - 1;
            if (j - 1 < intervals.length) {
                list.add(new int[] { first, Math.max(second, intervals[j - 1][1]) });
            } else {
                list.add(new int[] { first, second });
            }

        }
        for (int[] is : list) {
            System.out.print(is[0] + " , " + is[1]);
            System.out.println();
        }
        return res;
    }

    private static List<int[]> getMergedIntervals(int[][] intervals) {
        List<int[]> list = new ArrayList<>();

        if (intervals == null || intervals.length == 0)
            return list;

        // Step 1: Sort by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 2: Initialize first interval
        int[] current = intervals[0];

        // Step 3: Merge if overlapping
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= current[1]) {
                current[1] = Math.max(current[1], intervals[i][1]); // Merge
            } else {
                list.add(current); // No overlap, add current
                current = intervals[i]; // Move to next
            }
        }

        // Add the last interval
        list.add(current);

        return list;
    }
}
