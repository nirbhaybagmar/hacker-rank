/*Complete the function solveMeFirst to compute the sum of two integers.
    Function prototype:

    int solveMeFirst(int x, int y);

        where,

        x is the first integer input.
        y is the second integer input
        Return values

        sum of the above two integers
        package solutions.hackerrank.algorithms;

*/
import java.util.*;


public class sum_of_two_intergers {
    static int solveMeFirst(int a, int b) {
        // Hint: Type return a+b; below
        return a+b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}

