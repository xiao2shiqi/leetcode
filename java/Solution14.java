/**
 * LeetCode #14 : Longest Common Prefix
 * link：https://leetcode-cn.com/problems/longest-common-prefix/
 */
public class Solution14 {

    /**
     *  解题思路：时间复杂度：O(n2)
     *  1：获取索引0的元素作为匹配元素
     *  2：根据匹配元素的长度下标 i 为循环次数，遍历全部元素 j
     *  3：j 的下标元素根据 i 的元素索引位置，匹配字符串相等
     *  4：累加 matching，i 的下标匹配数 == 数组元素数量，则该匹配字符为公共字符
     */
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String sum = "";
        String startStr = strs[0];
        //拆开首元素来匹配
        for (int i = 0; i <= (startStr.length() - 1); i++) {
            String startElement = startStr.substring(i, i + 1);
            int matching = 0;
            //需要匹配的元素
            for (int j = 0; j < strs.length; j++) {
                if(i >= strs[j].length()) continue;
                //获取目标字符串
                String targetString = strs[j].substring(i, i + 1);
                if(startElement.equals(targetString)) matching++;
            }
            if(matching != strs.length) break;
            sum += startElement;
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] params = {"aacc","aacc","aabccbc"};
        String r = Solution14.longestCommonPrefix(params);
        System.out.println("r=" + r);
    }
}
