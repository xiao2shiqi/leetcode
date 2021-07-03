/**
 * LC#1812：判断国际象棋棋盘中一个格子的颜色
 * Link：https://leetcode-cn.com/problems/determine-color-of-a-chessboard-square/
 * 思路1：将 8x8 按照奇偶数放入 Hash 中，然后根据 coordinates 获取结果值
 * 思路2：根据规律可以预判出横轴坐标加纵轴坐标，直接返回结果即可
 * @author Phoenix on 2021/7/3.
 */
public class S1812 {

    public boolean squareIsWhite(String coordinates) {
        int firstIndex = coordinates.charAt(0);
        int lastIndex = coordinates.charAt(1);
        return (firstIndex % 2) + (lastIndex % 2) == 1;
    }

    public static void main(String[] args) {
        boolean squareIsWhite = new S1812().squareIsWhite("a3");
        System.out.println(">>>");
        System.out.println(squareIsWhite);

    }
}
