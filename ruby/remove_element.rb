=begin
    
LC#27 移除元素 Link：https://leetcode-cn.com/problems/remove-element/

思路：类似 LC#26
1：双指针遍历，j负责移动， i负责标记
2：当发现 nums[j] == val 时候，将元素位置移动到 [i]
3：
=end
def remove_element(nums, val)
    i = 0
    nums.each_index do |j| 
        if nums[j] != val
            nums[i] = nums[j]
            i+=1
        end
    end
    i
end

r = remove_element([3,2,2,3], 2)
p "rr> ", r