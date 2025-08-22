package Recursion_And_Backtraking;

public class ReverseString {
    public static void main(String[] args) {
        reverseString("Vishal");
    }

    private static void reverseString(String string) {
        String str = rever(string, "", string.length() - 1);
        System.out.println(str);
    }

    private static String rever(String string, String str, int i) {
        if (i < 0) {
            return str;
        }
        return rever(string, str + string.charAt(i), i - 1);
    }
}
