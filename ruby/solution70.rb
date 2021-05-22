=begin
LC#70. Climbing Stairs https://leetcode-cn.com/problems/climbing-stairs/
思路：
刚开始拿到题，觉得是递归的解法，尝试用递归，发现太多重复运算
Google看到可以用动态规划的思想来解决
既保存每次解法的结果到r[i]中
每上一层阶梯，就调用上次的结果来计算 
=end

# @param {Integer} n
# @return {Integer}
def climb_stairs(n)
  return n if [1, 2, 3].include?(n)
  r = []
  r[1] = 1
  r[2] = 2
  i = 3
  while i <= n do 
    r[i] = r[i - 1] + r[i - 2]
    i += 1
  end
  r[n]
end

res = climb_stairs(10)
p "res: #{res}"