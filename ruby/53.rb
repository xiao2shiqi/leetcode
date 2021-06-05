=begin
 * LC#53. Maximum Subarray 最大子序和
 * link : https://leetcode-cn.com/problems/maximum-subarray/comments/
 * 思路：刚开始没什么解题思路，看了官方解题才明白要用到动态规划来解，大概是用 pre 用于遍历记录运算的结果，maxAns 用于保存最大连续序列和的值，遍历完数组返回 maxAns 即可
=end

# @param {Integer[]} nums
# @return {Integer}
def max_sub_array(nums)
  pre = 0
  max_ans = nums[0]
  nums.each do |x|
    pre = pre + x > x ? pre + x : x
    max_ans = max_ans > pre ? max_ans : pre
  end
  max_ans
end

p "r >>", max_sub_array([-2,1,-3,4,-1,2,1,-5,4])