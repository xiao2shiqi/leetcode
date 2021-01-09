# Definition for singly-linked list.
class ListNode
  attr_accessor :val, :next

  def initialize(val)
    @val = val
    @next = nil
  end

  def to_s
    "ListNode: val: #{@val} next #{@next}"
  end
end

=begin
 * LC#21: Merge Two Sorted Lists
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 * 思路：
 * step1：创建新链表使用 -1 占位
 * step2：使用 prev 指针根据遍历顺序改变 next 引用
 * step3：判断链表参数，将还未遍历完的链表加入到 prev.next 引用
=end

def merge_two_lists(l1, l2)
  preNode = ListNode.new(-1);
  prev = preNode
  while l1 != nil && l2 != nil
    if l1.val <= l2.val
      prev.next = l1
      l1 = l1.next
    else
      prev.next = l2
      l2 = l2.next
    end
    prev = prev.next
  end
  prev.next = l1 != nil ? l1 : l2
  preNode.next
end

l1 = ListNode.new(1)
l2 = ListNode.new(2)
l3 = ListNode.new(4)
l1.next = l2
l2.next = l3

r1 = ListNode.new(1)
r2 = ListNode.new(3)
r3 = ListNode.new(4)
r1.next = r2
r2.next = r3

lists = merge_two_lists(l1, r1)
p 'lists result >>>'
p lists