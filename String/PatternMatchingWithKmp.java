package String;

public class PatternMatchingWithKmp {
    public static void main(String[] args) {
        String text = "ababcababcabc";
        String pattern = "abc";
        int[] lps = computeLPSArray(pattern);
        kmpSearch(text, pattern, lps);
    }

    private static void kmpSearch(String text, String pattern, int[] lps) {
        int n = text.length();
        int m = pattern.length();
        int i = 0; // index
        int j = 0; // index for pattern
        while (i < n) {
            // If characters match, move both indices forward
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }
            // If the entire pattern is found
            if (j == m) {
                System.out.println("Pattern found at index " + (i - j));
                j = lps[j - 1]; // Reset j using lps array
            } 
            // If there is a mismatch after j matches
            else if (i < n && text.charAt(i) != pattern.charAt(j)) {
                // If j is not zero, use lps to skip unnecessary comparisons
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++; // Move to the next character in text
                }
            }
            
        }
    }

    private static int[] computeLPSArray(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m];
        // lps[0] is always 0
        lps[0] = 0;
        // len stores the length of longest prefix which
        // is also a suffix for the previous index
        int len = 0;
        int i = 1;
        while (i < m) {
            // If characters match, increment the size of lps
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            // If there is a mismatch
            else {
                if (len != 0) {
                    // Update len to the previous lps value
                    // to avoid redundant comparisons
                    len = lps[len - 1];

                }else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
