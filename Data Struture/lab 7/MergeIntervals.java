import java.util.*;

public class MergeIntervals {
    
    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }
        
        // Sort intervals based on the starting time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        
        List<int[]> merged = new ArrayList<>();
        for (int[] interval : intervals) {
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                // No overlap, add the interval directly
                merged.add(interval);
            } else {
                // Overlap, merge the current interval with the last interval in merged
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }
        
        return merged.toArray(new int[merged.size()][]);
    }
    
    public static void printIntervals(int[][] intervals) {
        System.out.print("[");
        for (int i = 0; i < intervals.length; i++) {
            System.out.print("[" + intervals[i][0] + ", " + intervals[i][1] + "]");
            if (i < intervals.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    public static void main(String[] args) {
        int[][] intervals1 = {{1, 3}, {2, 4}, {6, 8}, {9, 10}};
        int[][] intervals2 = {{6, 8}, {1, 9}, {2, 4}, {4, 7}};
        
        System.out.println("Input: ");
        printIntervals(intervals1);
        System.out.println("Output: ");
        printIntervals(merge(intervals1));
        
        System.out.println("\nInput: ");
        printIntervals(intervals2);
        System.out.println("Output: ");
        printIntervals(merge(intervals2));
    }
}
