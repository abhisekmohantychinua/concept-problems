
/**
 * Problem Description
 * 
 * 
 * Question:- There are n houses build in a line,
 * each of which contains some housesue in it.
 * 
 * 
 * A thief is going to steal the
 * maximal housesue of these houses, but he can’t steal in two adjacent houses
 * because the owner of the stolen houses will tell his two neighbours left and
 * right side.
 * 
 * 
 * What is the maximum stolen housesue?
 * 
 * 
 * Sample Input: houses[] = {6, 7, 1, 3, 8, 2, 5}
 * 
 * 
 * Sample Output: 20
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class cpr3 {
    public static int maxStolenhousesue(List<Integer> houses) {
        int n = houses.size();
        if (n == 0)
            return 0;

        if (n == 1)
            return houses.get(0);

        if (n == 2)
            return Math.max(houses.get(0), houses.get(1));

        int[] record = new int[n];
        record[0] = houses.get(0);
        record[1] = Math.max(houses.get(0), houses.get(1));

        for (int i = 2; i < record.length; i++) {
            record[i] = Math.max(record[i - 2] + houses.get(i), record[i - 1]);
        }

        return record[n - 1];
    }

    public static void main(String[] args) {

        List<Integer> houses = new ArrayList<>();

        // input must be space separated
        Arrays.asList(System.console().readLine().split(" ")).forEach(i -> {
            houses.add(Integer.parseInt(i));
        });

        System.out.println("The ans is " + maxStolenhousesue(houses));
    }
}