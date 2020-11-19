package algorithms.java.easy;

/**
 * #7：ReverseInteger
 * https://leetcode-cn.com/problems/reverse-integer/
 * 时间复杂度：O(logn)
 * 思路：
 * 1 通过%10将整数从尾数弹出放入r中
 * 2 x弹完=0时，返回r（判断溢出）
 */
public class ReverseInteger {

    public static int reverse(int x) {
        long r = 0;
        while(x != 0) {
            int pop = x % 10;       //从x中弹出最后一位
            x = x / 10;             //改变x值
            //防止 r 溢出
//            if(r > Integer.MAX_VALUE / 10 || (r == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
//            if(r < Integer.MIN_VALUE / 10 || (r == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            r = r * 10 + pop;       //r将x弹出的值追加在尾部
        }
        return r > Integer.MAX_VALUE || r < Integer.MIN_VALUE ? 0 : (int) r;
    }

    public static void main(String[] args) {
        int x = 12345678;
        System.out.println(ReverseInteger.reverse(x));
    }
}