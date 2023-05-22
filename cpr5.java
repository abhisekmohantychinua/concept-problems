import java.util.HashMap;
import java.util.Map;

public class cpr5 {
    public static int romanToInt(String s) {
        int result = 0;
        Map<Character, Integer> romanValue = new HashMap<>();
        romanValue.put('I', 1);
        romanValue.put('V', 5);
        romanValue.put('X', 10);
        romanValue.put('L', 50);
        romanValue.put('C', 100);
        romanValue.put('D', 500);
        romanValue.put('M', 1000);
        result += romanValue.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 2, j = i + 1; j > 0; j--, i--) {
            if (romanValue.get(s.charAt(i)) < romanValue.get(s.charAt(j))) {
                result -= romanValue.get(s.charAt(i));
            } else {
                result += romanValue.get(s.charAt(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
