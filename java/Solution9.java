/**
 * LC#9: Palindrome Number
 * https://leetcode-cn.com/problems/palindrome-number/
 *
 * 解题思路：
 * 一：对比集合匹配：时间复杂度O(n)
 * 1 通过%10将数值弹出放入集合
 * 2 根据奇数和偶数计算需要matching的次数，例如长度4的数值，只需要匹配2次即可
 * 3 遍历集合，从i=0开始匹配并递增，匹配对象为 length - i，匹配成功flagNum++
 * 4 当匹配数 == flagNum 可以得出该数值是回文数
 *
 * 二：弹出匹配法：时间复杂度O(logN) （runtime beats !!!）
 * 1 将数值x通过循环弹出，赋值给r
 * 2 当 x < r 的时候，代表数值已经对半拆开，例如： x=2222， 拆开后 x=22， r=22
 * 3 判断 x == r 证明为回文数，x == r/10，处理x为奇数的情况
 */
public class Solution9 {

    public static boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) return false;
//      二：弹出匹配法：时间复杂度O(logN)
        int r = 0;
        while (x > r){
            r = r * 10 + x % 10;
            x = x / 10;
        }
        return x == r || x == r / 10;
    }
    public static void main(String[] args) {
        System.out.println("IsPalindrome : " + Solution9.isPalindrome(12321));
    }
}