=begin
 * LC#283 Move Zeroes 移动零
 * Link：https://leetcode-cn.com/problems/move-zeroes/
 * 思路1：思路很简单通过指针i，将所有非0元素向前移动，最后将 指针i...数组.length 区间全部填充零，线性时间复杂度，不使用额外的空间，直接干到了 java beats 100%
=end
def move_zeroes(nums)
    k = 0
    nums.each_index {|i|
        if nums[i] != 0 
            nums[k] = nums[i] 
            k += 1
        end
    }
    while (k < nums.length) 
        nums[k] = 0
        k += 1
    end
end

a = [0,1,0,3,12]
move_zeroes(a)
p "result>", a

