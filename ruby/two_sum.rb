=begin	
 Leetcode #1 Two Sum
 https://leetcode-cn.com/problems/two-sum/
 时间复杂度：O(n)

 思路：
 1 两次哈希求解
 2 将数组放入散列表
 3 遍历散列表，通过target-key得出匹配数组
 4 并且判断非自身元素，返回数组
=end
def two_sum (nums, target)
		hash = {}
		nums.each_with_index { |num, index| hash[num] = index }
		nums.each_index { |index|
			key_index = target - nums[index]
			return [index, hash[key_index]] if hash.has_key?(key_index) && hash[key_index] != index
		}
end

=begin
 验证结果
 给定 nums = [2, 7, 11, 15], target = 9
 因为 nums[0] + nums[1] = 2 + 7 = 9
 所以返回 [0, 1] 解决
=end
nums = [3, 2, 4]
target = 6
result = two_sum(nums, target)
p "result > ", result