// Last updated: 11/08/2026, 14:16:08
class Solution {
    public boolean validTicTacToe(String[] board) {
        int x = 0, o = 0;

        for (String s : board) {
            for (char c : s.toCharArray()) {
                if (c == 'X') x++;
                if (c == 'O') o++;
            }
        }

        if (o > x || x - o > 1) return false;

        boolean xWin = check(board, 'X');
        boolean oWin = check(board, 'O');

        if (xWin && oWin) return false;
        if (xWin && x != o + 1) return false;
        if (oWin && x != o) return false;

        return true;
    }

    boolean check(String[] b, char c) {
        return (b[0].charAt(0)==c && b[0].charAt(1)==c && b[0].charAt(2)==c) ||
               (b[1].charAt(0)==c && b[1].charAt(1)==c && b[1].charAt(2)==c) ||
               (b[2].charAt(0)==c && b[2].charAt(1)==c && b[2].charAt(2)==c) ||
               (b[0].charAt(0)==c && b[1].charAt(0)==c && b[2].charAt(0)==c) ||
               (b[0].charAt(1)==c && b[1].charAt(1)==c && b[2].charAt(1)==c) ||
               (b[0].charAt(2)==c && b[1].charAt(2)==c && b[2].charAt(2)==c) ||
               (b[0].charAt(0)==c && b[1].charAt(1)==c && b[2].charAt(2)==c) ||
               (b[0].charAt(2)==c && b[1].charAt(1)==c && b[2].charAt(0)==c);
    }
}