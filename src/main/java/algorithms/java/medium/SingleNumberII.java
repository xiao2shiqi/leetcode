package algorithms.java.medium;

/**
 * LC#137. 只出现一次的数字 II Single Number II（难度：中等）
 * Link：https://leetcode-cn.com/problems/single-number-ii/
 * 思路1 ：将数组按照出现次数，放入 HashMap，最后从 HashMap 中取出出现 1次的数字，空间复杂度 O(n) 时间复杂度 O(n)
 * 思路2（runtime beats 最优解）：使用位运算符：NOT，AND 和 XOR 可以实现 O(1) 的空间复杂度，当一个数出现3次自动抵消为0，最后只剩下出现1次的数字
 */

public class SingleNumberII {

    public static int singleNumber(int[] nums) {
        // 思路1
//        Map<Integer, Integer> hashMap = new HashMap<>();
//        for (int num : nums) hashMap.put(num, hashMap.containsKey(num) ? hashMap.get(num) + 1 : 1);
//        for (Integer key : hashMap.keySet()) if (hashMap.get(key) == 1) return key;
//        return -1;

        // 思路2
        int one = 0, two = 0, three;
        for (int num : nums) {
            two |= (one & num);
            one ^= num;
            three = (one & two);
            // 如果相应的位出现3次，则该位重置为0
            two &= ~three;
            one &= ~three;
        }
        return one;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,3,2};
        int result = SingleNumberII.singleNumber(nums);
        System.out.println("result=" + result);
    }

}
