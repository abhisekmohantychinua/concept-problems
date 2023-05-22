
/*
 * abc
 *  
positive integer d is said to be a factor of another positive integer N if when
N is divided by d, the remainder obtained is zero. For example, for number 12,
there are 6 factors 1, 2, 3, 4, 6, 12. Every positive integer k has at least
two factors, 1 and the number k itself. Given two positive integers N and k, write
a program to print the kth largest factor of N.


Input Format: The input is a comma-separated list of positive integer pairs (N,
k).


Output Format: The kth highest factor of N.
If N does not have k factors, the output should be 1.


Constraints:


1<N<10000000000
1<k<600.



You can assume that N will
have no prime factors which are larger than 13.





Input: 12,3
Output: 4



Explanation: N is 12, k is 3. The factors of 12 are (1,2,3,4,6,12). The highest
factor is 12 and the third largest factor is 4. The output must be 4.





Input: 30,9
Output: 1
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class cpr4 {
    public static void main(String[] args) {
        int N, k;
        String[] input = System.console().readLine().split(",");
        N = Integer.parseInt(input[0]);
        k = Integer.parseInt(input[1]);
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i < Math.sqrt(N); i++) {
            if (N % i == 0) {
                factors.add(i);
                if (i != N / i) {
                    factors.add(N / i);
                }
            }
        }
        Collections.sort(factors, Collections.reverseOrder());

        if (k <= factors.size()) {
            System.out.println(factors.get(k - 1));
        } else {
            System.out.println(1);
        }

    }
}
