/**
 * LC#1668：重复子字符串
 * Link：https://leetcode-cn.com/problems/maximum-repeating-substring/
 * 思路：刚开始思路不对，想用滑动窗口匹配，代码很复杂，效率还低，后面改用 StingBuilder 叠加 word 直到无法匹配为止
 */
public class S1668 {

    public int maxRepeating(String sequence, String word) {
        // 获取 word 长度，得出 sequence 匹配项
        String tmp = word;
        int count = 0;
        while (sequence.contains(word)) {
            word += tmp;
            count ++;
        }
        return count;
    }

    public static void main(String[] args) {
        String sequence = "ababc";
        String word = "ab";
        int resNum =  new S1668().maxRepeating(sequence, word);
        System.out.println(resNum);
    }
}
