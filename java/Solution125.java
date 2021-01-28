/**
 * LC#125 Valid Palindrome
 * Link：https://leetcode-cn.com/problems/valid-palindrome/
 */
public class Solution125 {

    public static boolean isPalindrome(String s) {
        if (s == null) return true;
        //没有什么复杂的逻辑，全部转小写，然后反转对比，So easy
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
