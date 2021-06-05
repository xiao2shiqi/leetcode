/**
 * LC#348: reverse string 反转字符串
 * Link：https://leetcode-cn.com/problems/reverse-string/
 * S：双指针，跟反转数组差不多。。。
 */
public class S344 {

    public static void reverseString(char[] s) {
        int n = s.length, left = 0, right = n - 1;
        while (left < right) {
            char tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++; right--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l'};
        reverseString(s);
        for (char c : s) {
            System.out.println(c);
        }
//        System.out.println(Arrays.toString(s));
    }
}
