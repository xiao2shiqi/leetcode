package algorithms.java.easy;

/**
 * leetcode #69. Sqrt(x)
 * link ：https://leetcode-cn.com/problems/sqrtx/
 */
public class Sqrt {

    public static int mySqrt(int x) {
        //不知道怎么实现，用内置函数居然可以
        return (int) Math.sqrt(x);
    }

    public static void main(String[] args) {
        int x = 2147395599;
        x = mySqrt(x);
        System.out.println("x=" + x);
    }
}
