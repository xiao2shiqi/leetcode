def search_insert(nums, target)
  nums.each_index do |i|
    return i if nums[i] >= target
  end
  nums.length
end

p "result >", search_insert([1,3,5,6], 0)
