/**
 * LC#242：Valid Anagram
 * Link：https://leetcode-cn.com/problems/valid-anagram/
 * Solution：
 * 1：sort：排序后对比，比较简单，时间复杂度 O(logN)
 * 2：Hash Table：有点类似桶排序，将字符 s 放入长度为 26 的 int[] 桶中，然后再遍历 t 从桶中取出元素进行对比
 */
public class S242 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            // 记录字母出现的频次
            table[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            // 减去对应位置的频次
            table[t.charAt(i) - 'a']--;
            // 频次不相等，返回 fasle
            if (table[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "anagram", t = "nagaram";
        System.out.println("company result:" + new S242().isAnagram(s, t));
    }
}
