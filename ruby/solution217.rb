=begin
 * LC#217 ContainsDuplicate 存在重复元素
 * Link：https://leetcode-cn.com/problems/contains-duplicate/
 * 思路1（runtime beats）: 基本不怎么思考就想到用哈希表查重，遍历数组，找到重复就返回 true，没有就进入哈希表保存，时间复杂度 O(n)
 * 思路2 ：先将数组排序，然后对象相邻 2个元素是否出现相等的情况，时间复杂度 O(n log n)
=end

def contains_duplicate(nums)
    # 思路1 解法
    hash = {}
    nums.each {|e|
        return true if hash.include?(e)
        hash[e] = 0
    }

    # 思路2 解法
    # nums = nums.sort
    # index = 1
    # while index < nums.length
    #     return true if nums[index] == nums[index - 1]
    #     index += 1
    # end
    return false
end

# nums = [1,2,3,1]      # CASE 1   true
# nums = [1,2,3,4]     # CASE 2 false
nums = [1,1,1,3,3,4,3,2,4,2]     # CASE 2 true
p "r >", contains_duplicate(nums) 