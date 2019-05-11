package algorithms.java.easy;

/**
 * leetcode 58. Length of Last Word
 * link ：https://leetcode-cn.com/problems/length-of-last-word/
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        String[] sa = s.split(" ");
        if(sa.length == 0) return 0;
        return sa[sa.length - 1].length();
    }

    public static void main(String[] args) {
        String s = "Hello World";
        int length = new LengthOfLastWord().lengthOfLastWord(s);
        System.out.println(length);
    }
}