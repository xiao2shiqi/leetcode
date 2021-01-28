/**
 * LC#414 第三大的数 Third Maximum Number
 * Link：https://leetcode-cn.com/problems/third-maximum-number/
 * 思路1：使用基于红黑树的 Tree 结构实现排序 + 去重，代码简洁，但是效率很低
 * 思路2（效率最高）：使用 3个变量 one, two, three 在循环中找出前三最大的值，如果没有则直接返回 one，简单粗暴，代码复杂，但是效率最高
 * 感受：感觉这道题出的不是很科学。。。
 * @author Phoenix on 2020/12/23 8:40 上午
 */

public class Solution414 {

    public int thirdMax(int[] nums) {
        // 使用 sort + List 实现排序 + 去重
//        Arrays.sort(nums);
//        List<Integer> list = new ArrayList<>();
//        for (int num : nums) {
//            if (!list.contains(num)) list.add(num);
//        }
//        return list.size() >= 3 ? list.get(list.size() - 3) : list.get(list.size() - 1);

        long MIN = Long.MIN_VALUE;    // MIN代表没有在值

        if (nums == null || nums.length == 0) throw new RuntimeException("nums is null or length of 0");
        int n = nums.length;

        int one = nums[0];
        long two = MIN;
        long three = MIN;

        for (int i = 1; i <  n; i++) {
            int now = nums[i];
            if (now == one || now == two || now == three) continue;    // 如果存在过就跳过不看
            if (now > one) {
                three = two;
                two = one;
                one = now;
            } else if (now > two) {
                three = two;
                two = now;
            } else if (now > three) {
                three = now;
            }
        }

        if (three == MIN) return one;  // 没有第三大的元素，就返回最大值
        return (int)three;
    }

    public static void main(String[] args) {

        int [] nums = {3, 2, 1};
//        int [] nums = {1, 2};

        Solution414 solution414 = new Solution414();
        System.out.println("max number :" + solution414.thirdMax(nums));

    }
}