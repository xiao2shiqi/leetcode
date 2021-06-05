/**
 * LC# 171 Excel Sheet Column Number
 */
public class S171 {

    public static int titleToNumber(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        for (int i = 0; i < chars.length; i++) {
            int tmp = chars[i]-'@';
            result = result * 26 + tmp;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "BA";
        System.out.println("result > " + titleToNumber(s));
    }
}
