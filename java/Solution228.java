import java.util.ArrayList;
import java.util.List;

/**
 * LC#228 汇总区间 Summary Ranges
 * Link：https://leetcode-cn.com/problems/summary-ranges/ 
 * 思路：2层循环，外层循环每次计算去区间的 low...hign，然后通过 string 构建字符连接，放入集合
 */
public class Solution228 {

    public List<String> summaryRanges(int[] nums) {
        List<String> ret = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int low = i; i++;
            while (i < nums.length && nums[i] == nums[i - 1] + 1) i++;
            StringBuffer temp = new StringBuffer(Integer.toString(nums[low]));
            if (low < i - 1) temp.append("->").append(Integer.toString(nums[i - 1]));
            ret.add(temp.toString());
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 4, 5, 7 };
        Solution228 solution228 = new Solution228();
        List<String> summaryRanges = solution228.summaryRanges(nums);
        System.out.println(summaryRanges);
    }
}