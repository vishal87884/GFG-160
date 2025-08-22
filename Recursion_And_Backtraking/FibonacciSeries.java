package Recursion_And_Backtraking;

public class FibonacciSeries {
    public static void main(String[] args) {
        // febonaci(10);
       System.out.println( fib(4, 0));
    }

    private static int fib(int n, int level) {
        // indent according to recursion depth
        String indent = " ".repeat(level * 4); // 4 spaces per level

        System.out.println(indent + "fib(" + n + ")");

        if (n == 0 || n == 1) {
            return n; // base case
        }

        int left = fib(n - 1, level + 1);
        int right = fib(n - 2, level + 1);

        return left + right;
    }

    private static void febonaci(int i) {
        int a = 0, b = 1, c = 0;
        printFebo(a, b, c, i);
    }

    private static void printFebo(int a, int b, int c, int i) {
        if (i <= 0) {
            return;
        }
        c = a + b;
        System.out.print(a + " ");
        a = b;
        b = c;
        printFebo(a, b, c, i - 1);
    }
}
