class Solution {
    public String longestPalindrome(String s) {

        int n = s.length();
        int start = 0, maxLen = 1;

        for (int i = 0; i < n; i++) {

            // Odd length palindrome
            int prev1 = i;
            int prev2 = i;

            while (prev1 >= 0 && prev2 < n &&
                    s.charAt(prev1) == s.charAt(prev2)) {

                if (prev2 - prev1 + 1 > maxLen) {
                    maxLen = prev2 - prev1 + 1;
                    start = prev1;
                }

                prev1--;
                prev2++;
            }

            // Even length palindrome
            prev1 = i;
            prev2 = i + 1;

            while (prev1 >= 0 && prev2 < n &&
                    s.charAt(prev1) == s.charAt(prev2)) {

                if (prev2 - prev1 + 1 > maxLen) {
                    maxLen = prev2 - prev1 + 1;
                    start = prev1;
                }

                prev1--;
                prev2++;
            }
        }

        return s.substring(start, start + maxLen);
    }
}