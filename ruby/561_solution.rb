=begin
LC#561 数组拆分
Link：https://leetcode-cn.com/problems/array-partition-i/
思路：对数组排序后，直接计算奇数下标即可
=end
def array_pair_sum(nums)
    nums.sort!
    i, sum = 0, 0
    while(i < nums.length) do
        sum = sum + nums[i]
        i = i + 2
    end
    sum
end

r = array_pair_sum([6,2,6,5,1,2])
p "r => #{r}" 