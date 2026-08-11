// Last updated: 11/08/2026, 14:13:56
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int maxDiag = 0;
        int maxArea = 0;

        for (int[] d : dimensions) {
            int l = d[0];
            int w = d[1];

            int diag = l * l + w * w;
            int area = l * w;

            if (diag > maxDiag || (diag == maxDiag && area > maxArea)) {
                maxDiag = diag;
                maxArea = area;
            }
        }

        return maxArea;
    }
}