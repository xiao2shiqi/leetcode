package algorithms.java.easy;

/**
 * LC#125
 */
public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        if (s == null) return true;
        s = s.toLowerCase();
        StringBuffer sb = new StringBuffer();
        for (char c : s.toCharArray()) {
            if((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
                sb.append(c);
            }
        }
        return sb.toString().equals(sb.reverse().toString());
    }

    public static void main(String[] args) {
//        String intput = "A man, a plan, a canal: Panama";
        String intput = "race a car";
        System.out.println("result > " + isPalindrome(intput));
    }
}
