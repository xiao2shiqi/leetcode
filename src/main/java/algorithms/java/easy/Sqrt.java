package algorithms.java.easy;

/**
 * leetcode #69. Sqrt(x)
 */
public class Sqrt {

    public static int mySqrt(int x) {
        //
        return (int) Math.sqrt(x);
    }

    public static void main(String[] args) {
        int x = 2147395599;
        x = mySqrt(x);
        System.out.println("x=" + x);
    }
}
