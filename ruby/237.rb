# Definition for singly-linked list.
class ListNode
  attr_accessor :val, :next
  def initialize(val)
    @val = val
    @next = nil
  end
end

=begin
LC#237：删除链表指定节点 Delete Node in a Linked List
Link：https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
思路1：很巧妙的一道题：思路是把当前节点变成 next 引用，从而让当前节点消失（当前节点的 next = next.next） 时间复杂度 O(1)，应该是最优解
=end

def delete_node(node)
  node.val = node.next.val
  node.next = node.next.next
end
