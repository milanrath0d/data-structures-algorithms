package org.milan.test;

/**
 * @author Milan Rathod
 */
public class CaesarEditDistance {

    public static void main(String[] args) {
        System.out.println(editDistance("abc", "gzu"));
        //System.out.println(editDistance("www", "ssh"));
    }

    public static int editDistance(String source, String target) {
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < 26; i++) {
            char[] arr = source.toCharArray();

            for (int j = 0; j < arr.length; j++) {
                char ch = arr[j];
                if ((ch + i) > 122) {
                    ch = (char) ((ch + i) - 26);
                } else {
                    ch = (char) (ch + i);
                }
                arr[j] = ch;
            }

            String shiftedSource = new String(arr);

            int editDistance = levenshteinDistance(shiftedSource, target);

            minDistance = Math.min(minDistance, editDistance);
        }

        return minDistance;
    }

    private static int levenshteinDistance(String source, String target) {

        int n = source.length();
        int m = target.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = i;
        }

        for (int j = 0; j <= m; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int cost = 0;
                if (source.charAt(i - 1) != target.charAt(j - 1)) {
                    cost = 2;
                }
                dp[i][j] = Math.min(dp[i - 1][j] + 1, Math.min(dp[i][j - 1] + 1, dp[i - 1][j - 1] + cost));
            }
        }

        return dp[m][n];
    }
}
