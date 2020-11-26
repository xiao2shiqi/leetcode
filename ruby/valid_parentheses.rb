=begin
 * #20: Valid Parentheses
 * https://leetcode-cn.com/problems/valid-parentheses/
 * 时间复杂度：O(n)
 * 解题思路：用栈数据结构解决
 * 1 使用散列表加载括号
 * 2 判断左括号push进栈
 * 3 判断右扩展就pop栈顶匹配
 * 4 栈内无元素代表完全匹配
=end

def is_valid(strs)
    symbol_map = {')' => '(', '}' => '{', ']' => '['}
    stack = []
    strs.size.times {|i|
        c = strs[i]
        if symbol_map.has_key?(c)
            top_e = stack.shift
            return false if symbol_map[c] != top_e
        else
            stack.unshift(c)
        end
    }
    stack.empty?
end

p "r => ", is_valid("([)]")