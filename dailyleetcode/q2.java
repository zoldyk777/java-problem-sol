// https://leetcode.com/problems/increment-submatrices-by-one/description/
class q2 {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] diff = new int[n][n];

        for(int i = 0; i < queries.length; i++) {
            int r0 = queries[i][0];
            int c0 = queries[i][1];
            int r1 = queries[i][2] + 1; // one past
            int c1 = queries[i][3] + 1; // one past

            diff[r0][c0]++;

            if (c1 < n) diff[r0][c1]--;
            if (r1 < n) diff[r1][c0]--;
            if (r1 < n && c1 < n) diff[r1][c1]++;
        }

        // prefix sum horizontally
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                diff[i][j] += diff[i][j - 1];
            }
        }
        for(int i = 1; i < n; i++) {
            for(int j=0; j< n; j++) {
                diff[i][j] += diff[i - 1][j];
            }
        }

        return diff;
    }
}
