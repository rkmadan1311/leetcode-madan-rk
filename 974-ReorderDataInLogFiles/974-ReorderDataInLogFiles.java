// Last updated: 11/08/2026, 14:15:47
class Solution {
    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (a, b) -> {
            String[] s1 = a.split(" ", 2);
            String[] s2 = b.split(" ", 2);

            boolean isDigit1 = Character.isDigit(s1[1].charAt(0));
            boolean isDigit2 = Character.isDigit(s2[1].charAt(0));

            if (!isDigit1 && !isDigit2) {
                int cmp = s1[1].compareTo(s2[1]);
                if (cmp != 0) {
                    return cmp;
                }
                return s1[0].compareTo(s2[0]);
            }

            if (!isDigit1) {
                return -1;
            }

            if (!isDigit2) {
                return 1;
            }

            return 0;
        });

        return logs;
    }
}