package ServiceNowOA;

public class SubSeqCount {
	
	/*
	 * given 2 string, determine the number of times the firts one appears as subsequence in the second one, 
	 * A subsequence is created by eliminating a number of characters from a string without changing the order 
	 * of the characters retained Exampe: S1= ABC, S2 = ABCBABC
answer is 5
	 */
	
	public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = "ABCBABC";
        int count = countSubsequences(s1, s2);
        System.out.println("The number of times the first string appears as a subsequence in the second string is: " + count);
	}
        public static int countSubsequences(String s1, String s2) {
            int m = s1.length();
            int n = s2.length();

            int[][] dp = new int[m + 1][n + 1];

            // Initializing the first column of the dp array with 1
            for (int i = 0; i <= m; i++) {
                dp[i][0] = 0;
            }
            // Initializing the first row of the dp array with 1
            for (int j = 0; j <= n; j++) {
                dp[0][j] = 1;
            }

            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    if (s1.charAt(i - 1) != s2.charAt(j - 1)) {
                        dp[i][j] = dp[i][j - 1];
                    } else {
                        dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1];
                    }
                }
            }

            return dp[m][n];
        }
        
}
