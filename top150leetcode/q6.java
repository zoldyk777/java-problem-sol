// https://leetcode.com/problems/set-intersection-size-at-least-two/description/?envType=daily-question&envId=2025-11-20
import java.util.Arrays;
class q6 {
    public int intersectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> 
            a[1] == b[1] ? b[0] - a[0] : a[1] - b[1]
        );

        int p1 = -1, p2 = -1;  
        int count = 0;

        for (int[] inter : intervals) {
            int start = inter[0];
            int end = inter[1];

            boolean p1In = (p1 >= start);
            boolean p2In = (p2 >= start);

            if (p1In && p2In) continue;

            if (p1In) {
                count++;
                p2 = p1;
                p1 = end;
            } else {
                count += 2;
                p2 = end - 1;
                p1 = end;
            }
        }

        return count;
        
    }
}