=begin
LC#35 Search Insert Position
Link：https://leetcode-cn.com/problems/search-insert-position/
思路：题目非常简单，看到是有序数组，最先想到的就是 O(n) 的解法，CASE也能顺利通过，不过解答方式似乎不是最优，感觉这道题作者想考察的方向应该是给一个有序数组，通过二分查找达到 O(lon N) 的时间解答效率
=end
def search_insert(nums, target)
  nums.each_index do |i|
    return i if nums[i] >= target
  end
  nums.length
end

p "result >", search_insert([1,3,5,6], 0)
