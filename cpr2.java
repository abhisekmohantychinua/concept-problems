
/**
 * test
 * print smallest substring 
 */
import java.util.Scanner;

public class cpr2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s + "\0";
        char[] arr = s.toCharArray();

        int curlen = 0, minlen = 99;
        int st = 0, stindx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ' || arr[i] == '\0') {
                if (curlen < minlen) {
                    minlen = curlen;
                    stindx = st;
                }
                curlen = 0;
                st = i + 1;
            } else {
                curlen++;
            }
        }

        for (int i = stindx; i < stindx + minlen; i++) {

            System.out.print(arr[i]);
        }
    }
}