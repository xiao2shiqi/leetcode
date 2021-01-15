# @param {Integer[]} nums
# @return {Integer}
=begin
 * LC#268 Missing Number 消失的数字
 * Link：https://leetcode-cn.com/problems/missing-number/
 * 思路：
 * 解法 1：排序：首先排序数组，然后遍历数组，如果当前节点 -1 != [currentNode - 1] 则表示数组不连续，返回当前节点，否则返回 -1
 * 解法 2：哈希：首先将数组加入哈希表，然后根据哈希表 length 开始遍历，如果判断哈希表不包含该元素则表示，当前元素不连续，否则返回 -1
 * 解法 3：数学公式：先用求和公式 y = n * (n + 1) / 2 得出 1...n 的合计值 y，然后使用 y - (sum(nums)) 得出结果
=end
def missing_number(nums)
  n = nums.length
  expected_sum = n * (n + 1) / 2
  actual_sum = 0
  nums.each { |i| actual_sum += i }
  expected_sum - actual_sum
end

r = missing_number([0,1,2,3,4,6])
p "r >", r