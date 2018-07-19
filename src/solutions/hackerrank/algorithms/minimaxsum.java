/*
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.

Input Format:-  A single line of five space-separated integers.


Constraints:-  Each integer is in the inclusive range [1,10^9].
Output Format:- Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than the 32-bit integer.)

Sample Input:-  1 2 3 4 5
Sample Output:- 10 14
Explanation:-  Our initial numbers are 1, 2, 3, 4, and 5. We can calculate the following sums using four of the five integers:

If we sum everything except 5, our sum is 1+2+3+4=10.
Same goes for 4, our sum is 1+2+3+5=11.
Same goes for  3, our sum is 1+2+4+5=12.
Same goes for  2, our sum is 1+3+4+5=13.
Same goes for  1, our sum is 2+3+4+5=14.

As you can see, the minimal sum is 10 and the maximal sum is 14. Thus, we print these minimal and maximal sums as two space-separated integers on a new line.
 */
package solutions.hackerrank.algorithms;
import java.io.*;
import java.util.*;
public class minimaxsum {
        // Complete the miniMaxSum function below.
        static void miniMaxSum(int[] arr) {
            int large = 0, small = arr[0];
            long sum = 0 ;
            for(int i = 0; i < arr.length ; i++)
                if (arr[i] > large)
                    large = arr[i];
                else if (arr[i] < small) small = arr[i];
            for(int i = 0; i < arr.length ; i++)
            {
                sum = sum + arr[i];
            }
            System.out.print(sum - large + "\t");
            System.out.println(sum - small);
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] arr = new int[5];
            for (int i = 0; i < 5; i++) {
                arr[i] = scanner.nextInt();
            }
            miniMaxSum(arr);
            scanner.close();
        }
    }


