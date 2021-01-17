=begin
 * LC#448：Find All Numbers Disappeared in an Array 找到所有数组中消失的数字
 * Link：https://leetcode-cn.com/problems/find-all-numbers-disappeared-in-an-array/
 * 思路：
 * 解法1：哈希：思路很简单，先将 nums.length 循环加入哈希，然后遍历 nums[] 将哈希表内不存在的值放入 list 并且返回（效率比较低，空间复杂度 O(n)）
 * 解法2：索引位更新，遍历 nums[]，将索引值更改为负数，如果数组齐全，那么正常情况所有 value 都会更新为负数，然后遍历数组，未更新为负数的索引位，就是丢失的数字（空间复杂度 O(1)）
=end

def find_disappeared_numbers(nums)
  nums.each {|e| nums[e.abs - 1] = nums[e.abs - 1] * -1 if nums[e.abs - 1] > 0}
  result = []
  nums.each_index { |i| result.push(i + 1) if nums[i] > 0 }
  result
end

r = find_disappeared_numbers([1, 1])
p "result : #{r}"
