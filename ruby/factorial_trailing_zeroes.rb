=begin
 LC#172 Factorial Trailing Zeroes 计算阶乘后的零
 Link：https://leetcode-cn.com/problems/factorial-trailing-zeroes/
 思路：先计算阶乘，然后通过求模%运算计算零的数量（达不到官方要求的 O(log n) 时间复杂度）
=end

def trailing_zeroes (n)
    n_factorial = 1
    i = 2
    for i in 2..n
        n_factorial *= i
    end
    zero_count = 0
    while n_factorial % 10 == 0
        zero_count += 1
        n_factorial /= 10
    end
    zero_count
end

r = trailing_zeroes(13)
p "r > ", r