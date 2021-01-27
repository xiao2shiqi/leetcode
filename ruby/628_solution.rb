=begin
LC#628 三个数的最大乘积 Maximum Product of Three Numbers
Link：https://leetcode-cn.com/problems/maximum-product-of-three-numbers/
思路1：排序数组，存在正数和负数两种情况，对比两种情况返回的值，返回最大值
思路2：原地找出 5个计算数（3个最大正数，2个最大负数），计算出结果值，返回最大值（因为减少排序，所以效率更高）
=end

def maximum_product(nums)
    max1, max2, max3 = -9999999,-9999999,-9999999
    min1, min2 = 9999999,9999999
    nums.each do |x|
        if x > max1 
            max3 = max2
            max2 = max1
            max1 = x
        elsif x > max2
            max3 = max2
            max2 = x
        elsif x > max3 
            max3 = x
        end
        
        if x < min1
            min2 = min1
            min1 = x
        elsif x < min2
            min2 = x
        end
    end

    positive_number = max1 * max2 * max3
    negative_number = min1 * min2 * max1
    positive_number > negative_number ? positive_number : negative_number
end

r = maximum_product([-1, -2, -3])
p "result : #{r}"