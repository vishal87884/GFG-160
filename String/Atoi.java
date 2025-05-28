package String;

public class Atoi {
    public static void main(String[] args) {
        String str = "-999999999999";
        int result;

        result = myAtoi(str);

        System.out.println(result); // Output: 1234
    }

    public static int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0)
            return 0;

        int i = 0, sign = 1, number = 0;

        // Handle sign
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while (i < s.length()) {
            char c = s.charAt(i);
            if (c < '0' || c > '9')
                break;

            int digit = c - '0';

            // Check for overflow
            if (number > Integer.MAX_VALUE / 10 ||
                    (number == Integer.MAX_VALUE / 10 && digit > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            number = number * 10 + digit;
            i++;
        }

        return number * sign;
    }
}
