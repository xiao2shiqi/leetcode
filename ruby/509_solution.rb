=begin
LC#509：斐波那契数 Fibonacci Number
Link：https://leetcode-cn.com/problems/fibonacci-number/ 思路：
解法1：直接用常规的兔子问题的递归解法：f(n) = f(n -1) + f (n - 2)，因为存在递归，时间和空间的效率都不理想 解法2：
解法2：使用动态规划推到兔子问题的递归公式，降低递归带来的栈开销，空间复杂度降为 O(1)
=end
def fib(n)
    return n if n < 2
    p, q, r, i = 0, 0, 1, 2
    while (i <= n) do
        p, q,  = q, r
        r = p + q
        i += 1
    end
    r
end

r = fib(6)
p "r => #{r}"