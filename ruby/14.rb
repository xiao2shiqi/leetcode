=begin
LC#14 : Longest Common Prefix
Link：https://leetcode-cn.com/problems/longest-common-prefix/

解题思路：时间复杂度：O(n2)
1：获取索引0的元素作为匹配元素
2：根据匹配元素的长度下标 i 为循环次数，遍历全部元素 j
3：j 的下标元素根据 i 的元素索引位置，匹配字符串相等
4：累加 matching，i 的下标匹配数 == 数组元素数量，则该匹配字符为公共字符
=end

def longest_common_prefix(strs)
    return "" if strs.size == 0
    result = ""
    matchi_str = strs[0]
    matchi_str.size.times {|i|
        matchi_i = 0
        strs.size.times {|j| matchi_i += 1 if matchi_str[i] == strs[j][i] }
        break if matchi_i != strs.size
        result += matchi_str[i]
    }
    result
end

r = longest_common_prefix(["flower","flow","flight"])
p "result : #{r}"