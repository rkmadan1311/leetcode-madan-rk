// Last updated: 11/08/2026, 14:19:52
class Solution {
    public String countAndSay(int n) {
        String result = "1";

        for (int i = 1; i < n; i++) {
            String temp = "";
            int count = 1;

            for (int j = 1; j <= result.length(); j++) {
                if (j < result.length() && result.charAt(j) == result.charAt(j - 1)) {
                    count++;
                } else {
                    temp += count;
                    temp += result.charAt(j - 1);
                    count = 1;
                }
            }

            result = temp;
        }

        return result;
    }
}