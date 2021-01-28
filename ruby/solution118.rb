=begin
 * LC#118 Pascal's Triangle 杨辉三角
 * Link: https://leetcode-cn.com/problems/pascals-t/solution/yang-hui-san-jiao-by-leetcode/
 * 思路1：根据 numRows 构建数组层数，杨辉三角可以归类为动态规划，核心思路是基于上一层 prevRow 保存的数据，来构建当前层 row 数组
 * 思路2：直接套用组合公式 c = c*(n-m)/(m+1)，根据 numRows 计算出每层的元素，放入层级集合 triangle 中
 * 执行效率：O(n2)
=end

def pascals_triangle (num_rows)
  t = []
  return t if num_rows == 0

  num_rows.times {|k|
    cur,i  = 1, 0
    r = []
    while i <= k
      r[i] = cur
      cur = cur * (k - i)/(i + 1)
      i+=1
    end
    t[k] = r
  }
  t
end

p "r >>", pascals_triangle(5)