import java.util.HashSet;
import java.util.Set;

/**
 * LC#3：无重复字符的最长子串
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 * 思路1：两层循环计数，从当前字符开始计算每个字符出现的最大序列，并且使用 ans 保存最长序列
 */
public class S3 {

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> saveStr = new HashSet<>();
        int n = s.length();
        int ans = 0;        // 记录出现过的值
        int startIndex = -1;     // 指针
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                // 在哈希中移除对上一个字符的保存，从而保证后面结果的正确性
                saveStr.remove(s.charAt(i - 1));
            }
            // 依次递归子串最大位置，直到遇到相同值
            while (startIndex + 1 < n && !saveStr.contains(s.charAt(startIndex + 1))) {
                saveStr.add(s.charAt(startIndex + 1));
                startIndex++;
            }
            ans = Math.max(ans, startIndex - i + 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "dvdf";
        int res = lengthOfLongestSubstring(str);
        System.out.println("res >" + res);
    }
}
