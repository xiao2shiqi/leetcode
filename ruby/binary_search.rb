# 最基本的二分查找

def binary_search(array_num, target) 
    low = 0
    high = array_num.length - 1

    while high >= low
        mid = (low + high) / 2
        p "mid : #{mid}"
        e = array_num[mid]
        return mid if e == target
        high = mid - 1 if e > target
        low = mid + 1 if e < target
    end
    -1
end

p 'r>',binary_search((0..100000).to_a, 75)