// Last updated: 11/08/2026, 14:15:53
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : deck) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int gcd = 0;

        for (int count : map.values()) {
            gcd = findGCD(gcd, count);
        }

        return gcd >= 2;
    }

    private int findGCD(int a, int b) {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }
}