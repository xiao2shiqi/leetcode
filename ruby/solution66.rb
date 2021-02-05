=begin
 LC#66：Plus One
 Link：https://leetcode-cn.com/problems/plus-one/
 通过 for 从数组尾部开始 + 1，没有遇到 0 则直接返回，遇到0 则继续向上 + 1，当数组全为 0 时，在头部扩容，插入 1
=end
def plus_one(digits)
    index = digits.length - 1; 
    while (index >= 0) 
        digits[index] = digits[index] + 1
        digits[index] = digits[index] % 10
        if (digits[index] != 0) 
            return digits;
        end
        index = index - 1
    end
    digits.insert(0,1)
    return digits
end

r = plus_one([9,9,9])
p "r>>#{r}"