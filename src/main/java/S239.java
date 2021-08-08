import java.util.Arrays;
import java.util.LinkedList;

/**
 * LC#239：Sliding Window Maximum 滑动窗口最大值
 * Link：https://leetcode-cn.com/problems/sliding-window-maximum/
 * Solution：双端队列
 * @author Phoenix on 2021/8/8.
 */
public class S239 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        // 长度太短没必要执行代码
        if(nums == null || nums.length < 2) return nums;
        LinkedList<Integer> queue = new LinkedList<>();
        // 算出结果集长度
        int[] result = new int[nums.length - k + 1];
        // 遍历 nums 数组
        for (int i = 0; i < nums.length; i++) {
            // 如果元素比较小，直接弹出
            while (!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]) {
                queue.pollLast();
            }
            // 添加下标
            queue.addLast(i);
            // 判断队列首部是否有效
            if(queue.peek() <= i-k) {
                queue.poll();
            }
            // 当长度为 k 时，保存当前窗口最大值
            if(i+1 >= k) {
                result[i+1-k] = nums[queue.peek()];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] ints = new S239().maxSlidingWindow(nums, k);
        System.out.println("output:" + Arrays.toString(ints));
    }
}
