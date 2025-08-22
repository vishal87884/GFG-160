package Recursion_And_Backtraking;

public class Factorial {
    public static void main(String[] args) {
        int res = factorial(5, 1);
        System.out.println(res);
    }

    private static int factorial(int i, int num) {
        if (i <= 0) {
            return num;
        }
        return factorial(i - 1, num * i);
    }
    
}
