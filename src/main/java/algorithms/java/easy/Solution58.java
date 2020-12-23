package algorithms.java.easy;

/**
 * LC#58. Length of Last Word 最后一个单词的长度
 * link ：https://leetcode-cn.com/problems/length-of-last-word/
 * 思路1：使用 split 分割空格字符串，获得字符数组 a[]，再直接获取 a[] 最后一个元素的长度即可： a[a.length - 1].length()
 * 思路2：先移除 s 尾部的空格，然后从尾部开始遍历递减字符串元素，当遇到 char == '' 时结束统计，变量 i 累积的值就是最后一个单词的长度，效率比解法1更加高效，无法切开字符处理
 */
public class Solution58 {

    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        while(end >= 0 && s.charAt(end) == ' ') end--;
        if(end < 0) return 0;

        int start = end;
        while(start >= 0 && s.charAt(start) != ' ') start--;
        return end - start;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        int length = new Solution58().lengthOfLastWord(s);
        System.out.println(length);
    }
}