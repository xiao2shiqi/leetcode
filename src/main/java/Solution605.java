/**
 * LC#566 Can Place Flowers
 * Link：https://leetcode-cn.com/problems/can-place-flowers/
 * 思路1： 计算 0 的数量，3个0 = 1个flower （能过单元测试，但会出现越界的情况）
 * 思路2：
 */
public class Solution605 {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int num = 0,count = 1;  //假设在数组左边添加0，以解决边界问题，令count初始为1
        for (int i=0;i<flowerbed.length;i++){
            if (flowerbed[i] == 0){
                count++;
            }else{
                count = 0;
            }
            if (count == 3){    //每连续三个0种一次花
                num++;
                count = 1;
            }
        }
        if (count == 2){    //如果最后count为2而不是1，表示最后一个位置可以种花
            num++;
        }
        return n <= num;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,0,0,1};
        int n = 2;
        boolean canPlaceFlowers = new Solution605().canPlaceFlowers(flowerbed, n);
        System.out.println("result:" + canPlaceFlowers);
    }

}