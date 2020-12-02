package algorithms.java.easy;

/**
 * LC#67 二进制求和
 * Link：https://leetcode-cn.com/problems/add-binary/
 * 思路：通过 Integer 内置函数，将 params a + params b 结果转为二进制
 * @author Phoenix on 2020/12/1.
 */
public class AddBinary {

    public static String addBinary(String a, String b) {
        int i = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        return Integer.toBinaryString(i);
    }

    public static void main(String[] args) {
        String sum = AddBinary.addBinary("1010", "1010");
        System.out.println("sum :" + sum);
    }
}
