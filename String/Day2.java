package String;
public class Day2 {
    public static void main(String[] args) {
     System.out.println(minValue("abbcc", 2));
    }

    public static int minValue(String s, int k) {
        int ch[] = new int[26];
        for (char c : s.toCharArray()) {
            ch[c - 'a']++;
        }
        int max = -1, pi = -1;
        for (int i = 0; i < 26; i++) {
            int value = ch[i];
            if (value - k > 0 && max < value) {
                max = value;
                pi = i;
            }
        }
        int res = 0;
        if (max == -1) {
            for (int i : ch) {
                if (i > 0) {
                    i = i - k;
                    k = k - 1;
                    res += i * i;
                } else if (i > 0 && k <= 0) {
                    res += i * i;
                }
            }
        } else {
            for (int i = 0; i < 26; i++) {
                int value = ch[i];
                if (i == pi) {
                    value = value - k;
                    res += (value) * value;
                } else if (ch[i] > 0) {
                    res += value * value;
                }
            }
        }
        return res;
    }
}
