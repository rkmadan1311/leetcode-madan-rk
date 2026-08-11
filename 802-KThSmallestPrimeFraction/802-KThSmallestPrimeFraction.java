// Last updated: 11/08/2026, 14:16:11
class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<double[]> pq = new PriorityQueue<>(
            (a, b) -> Double.compare((double)a[0] / a[1], (double)b[0] / b[1])
        );

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                pq.offer(new double[]{arr[i], arr[j]});
            }
        }

        while (--k > 0) {
            pq.poll();
        }

        double[] res = pq.poll();
        return new int[]{(int)res[0], (int)res[1]};
    }
}