=begin
 * LC#28 实现 strStr()
 * Link: https://leetcode-cn.com/problems/implement-strstr/
 * 思路：根据 haystack needle 滑动窗口，substring 截取匹配字符串，返回下标
=end

def str_str(haystack, needle)
    return 0 if needle.empty?
    l = needle.size
    start = 0
    while start < (haystack.size - l + 1) do
        return start if haystack[start..start + l - 1] == needle
        start+=1
    end
    -1
end

p str_str("a", "")