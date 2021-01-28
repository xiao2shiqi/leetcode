/**
 * LC#28 实现 strStr()
 * Link: https://leetcode-cn.com/problems/implement-strstr/
 * 思路：根据 haystack needle 滑动窗口，substring 截取匹配字符串，返回下标
 */
public class Solution28 {

    public int strStr(String haystack, String needle) {
        int L = needle.length();
        int n = haystack.length();
        for (int start = 0; start < n - L + 1; ++start) {
            String interceptStr = haystack.substring(start, start + L);
            if (interceptStr.equals(needle)) return start;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution28 strStr = new Solution28();
        System.out.println(strStr.strStr("Hello", "ll"));
    }

}
