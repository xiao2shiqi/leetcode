=begin
* #7：ReverseInteger
* https://leetcode-cn.com/problems/reverse-integer/
* 时间复杂度：O(logn)
* 思路：
* 1 通过%10将整数从尾数弹出放入r中
* 2 x弹完=0时，返回r（判断溢出）
=end

def reverse_integer (target_num)
  # ruby 负数求余有些问题，转成正数后再处理
  is_negative = true if target_num < 0
  target_num = target_num.abs
  r = 0
  while target_num > 0 do
    r = r * 10 + (target_num % 10)
    target_num = target_num / 10
    r = 0 if r > (2**31) || r < (-2**31)
  end
  is_negative ? r * -1 : r
end

r = reverse_integer(1534236469)
p "r >", r