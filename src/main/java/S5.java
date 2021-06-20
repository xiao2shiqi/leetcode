/**
 * LC#5：Longest Palindromic Substring
 * Link：https://leetcode-cn.com/problems/longest-palindromic-substring/
 * 思路1：想着用 Stack 来匹配回文就完事了，但是没有办法返回最长回文串，看来用简单的思维来解 middle 题行不通，卡了 20 ms 逐放弃
 * 思路2：3层循环暴力解法：把字符串的可能性找出来，然后返回最长的回文字符串，时间复杂度 O(n3)，Leetcode 运行超出时间限制。。。
 * 思路3：中心扩散算法：每次遍历从中心开始向两边扩展，尽可能的获取回文的长度，从而计算出 start 和 end 的区间值，时间复杂度 O(n2)，常数级的空间复杂度
 * 思路4：DP 动态规划：解题思路看代码。。。。时间复杂度 O(n2)，空间复杂度 O(n2)
 * 思路5：官方还有一个 Manacher 专门用户字符串匹配算法的解法，专复杂度可以达到 O(n)，不过太复杂了确实看不懂。。
 * @author Phoenix on 2021/6/20.
 */
public class S5 {

    // DP 动态规划
    public String longestPalindrome(String s) {
        int len = s .length();
        if (len < 2) return s;

        int maxLen = 1, begin = 0;
        // dp[i][j] 表示子串 s[i..j] 是否为回文子串
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            // 初始化二维数组的对角线元素
            dp[i][i] = true;
        }
        char[] charArray = s.toCharArray();
        for (int L = 2; L <= len; L++) {

            for (int i = 0; i < len; i++) {
                int j = L + i - 1;
                if (j >= len) break;
                // 头尾不相等，则记录为不是回文
                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        // 当 s[i..j] 为2或者3时，不需要检查子串是否回文
                        dp[i][j] = true;
                    } else {
                        // 状态转移
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                // 记录回文的起始和结尾位置（最长）
                if (dp[i][j] && j - i + 1 >maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }


    public static void main(String[] args) {
        String s = "babad";
        String s1 = new S5().longestPalindrome(s);
        System.out.println("s1 >>" + s1);
    }
}
