# @param {Integer} row_index
# @return {Integer[]}
=begin
 * LC#119 Pascal's Triangle II 杨辉三角 II
 * Link：https://leetcode-cn.com/problems/pascals-triangle-ii/
 * 思路1：直接套用 LC#117 解法，返回 row 指定层的数组即可，缺点：代码多并且复杂，空间复杂度差，甚至达不到作者要求 O(k) 的要求
 * 思路2（runtime beats）：直接套用组合公式 c = c*(n-m)/(m+1)，直接计算当前层，符合空间复杂度 O(k) 的要求，比解法1代码量少了很多，性能也更好
=end

def get_row(row_index)
   cur, i = 1, 0
   r = []
   while i <= row_index
    r[i] = cur
    cur = cur * (row_index-i)/(i+1)
    i+=1
   end
   r
end

p "r >>", get_row(3)