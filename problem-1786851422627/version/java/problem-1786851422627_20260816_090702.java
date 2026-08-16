// Last updated: 16/08/2026, 09:07:02
1class Solution {
2    public int nearestDrone(int[][] drones, int[] target) {
3     int minDistance=Integer.MAX_VALUE;
4        int bestIndex=-1;
5        int tx=target[0];
6        int ty=target[1];
7        for(int i=0;i<drones.length;i++){
8            int dx=drones[i][0];
9            int dy=drones[i][1];
10            int range=drones[i][2];
11            int distance=Math.abs(dx-tx)+Math.abs(dy-ty);
12            if(distance<=range){
13            if(distance<minDistance){
14                minDistance=distance;
15                bestIndex=i;
16            }
17        }
18    }
19    return bestIndex;
20}
21}