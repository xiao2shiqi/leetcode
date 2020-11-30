=begin
 * LC#118 Pascal's Triangle 杨辉三角
 * Link: https://leetcode-cn.com/problems/pascals-triangle/solution/yang-hui-san-jiao-by-leetcode/
 * 思路：根据 num_rows 构建数组层数，杨辉三角可以归类为动态规划，核心思路是基于上一层 prev_row 保存的数据，来构建当前层 row 数组
 * 执行效率：O(n2)
=end

def pascals_triangle (num_rows)
  return [] if num_rows == 0
  triangle = [[]]
  triangle.first.push(1)
  row_num = 1
  while row_num < num_rows
    prev_row = triangle[row_num - 1]
    row = [].push(1)
    j = 1
    while j < row_num
      row.push(prev_row[j-1] + prev_row[j])
      j+=1
    end
    row.push(1)
    triangle.push(row)
    row_num+=1
  end
  triangle
end

p "r >>", pascals_triangle(5)