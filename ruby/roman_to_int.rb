
=begin
 * #13 : Roman to Integer
 * https://leetcode-cn.com/problems/roman-to-integer/
 *
 * 解题思路：
 *  1 创建一个Map建立罗马符号和数字映射表
 *  2 创建一个Map建立特殊情况字符要处理的罗马符号
 *  3 for循环根据输入从映射表中获取数字求和就可以了
 *  4 遇到特殊字符就从映射表中找出要特殊处理对应的罗马符号表，进行逻辑运算就行
=end

def roman_to_int (roman_str)
    # 常规 && 特殊罗马字符
    normal_roman = {'I' => 1, 'V' => 5, 'X' => 10, 'L' => 50, 'C' => 100, 'D' => 500, 'M' => 1000}
    special_roman = {'V' => 'I', 'X' => 'I', 'L' => 'X', 'C' => 'X', 'D' => 'C', 'M' => 'C'}
    sum = 0
    (roman_str.size).times {|i| 
        c = roman_str[i]
        next if !normal_roman.has_key?(c)
        sum = sum + normal_roman[c]
        sum = sum - normal_roman[special_roman[c]] * 2 if i > 0 && special_roman.has_key?(c) && roman_str[i - 1] == special_roman[c]
    }
    sum < 1 ? 1 : sum > 3999 ? 3999 : sum
end

p 'r >', roman_to_int('MMMCDXC')