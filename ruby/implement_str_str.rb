=begin
 * LC#28 实现 strStr()
 * Link: https://leetcode-cn.com/problems/implement-strstr/
 * 思路：根据 haystack needle 滑动窗口，substring 截取匹配字符串，返回下标
=end

def str_str(haystack, needle)
    return 0 if needle.empty?
    l = needle.size
    n = haystack.size
    start = 0
    while start < n - l + 1 do
        interceptStr = haystack[start..start + l - 1]
        return start if interceptStr == needle
        start+=1
    end
    -1
end

p str_str("a", "")