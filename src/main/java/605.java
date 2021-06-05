/**
 * LC#605 Can Place Flowers
 * Link：https://leetcode-cn.com/problems/can-place-flowers/
 * 思路1：数组，计算 0 的数量，出现3个0 = 1个flower （能过单元测试，但会出现越界的情况，论坛里有一种通过在数组前后插入 0 解决的方法，也是很不错的解决思路）
 * 思路2：贪心：通过 prev 维护上一次种花的位置，遇到 flowerbed[i] == 1 计算区间可以种花的数量，最终再根据 prev 和数组 m 计算最后一个区间可以种花的数量，计算出 count 判断 >= n 即可
 */
public class Solution605 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int m = flowerbed.length;
        int prev = -1;
        for (int i = 0; i < m; i++) {
            if (flowerbed[i] == 1) {
                if (prev < 0) {
                    count += i / 2;
                } else {
                    count += (i - prev - 2) / 2;
                }
                prev = i;
            }
        }
        if (prev < 0) {
            count += (m + 1) / 2;
        } else {
            count += (m - prev - 1) / 2;
        }
        return count >= n;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,0,0,1};
        int n = 2;
        boolean canPlaceFlowers = new Solution605().canPlaceFlowers(flowerbed, n);
        System.out.println("result:" + canPlaceFlowers);
    }

}