=begin
 * #26: Remove Duplicates from Sorted Array
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 * 思路：
 * 1 双指针记录：j移动指针，i记录指针
 * 2 当num[j] > num[i] 则代表有序，i++，i移动到nums[j]
 * 3 以此类推
=end 
def remove_duplicates(nums)
    i = 0
    return i if nums.empty?
    nums.each_index{|j|
        if nums[j] > nums[i]
            i+=1
            nums[i] = nums[j]
        end
    }
    i + 1
end

r = remove_duplicates([0,0,1,1,1,2,2,3,3,4])
p "r > #{r}"