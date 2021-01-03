# Definition for singly-linked list.
class ListNode
    attr_accessor :val, :next
    def initialize(val)
        @val = val
        @next = nil
    end
end

=begin
 LC#876 链表的中间结点 Middle of the Linked List
 Link：https://leetcode-cn.com/problems/middle-of-the-linked-list/
 解法1：先统计链表长度 len，计算中间元素位置，再次遍历 head 返回中间元素 ListNode
 解法2：利用快慢指针，快指针每次走两步，慢指针每次走一步，所以快指针走的距离为慢指针的两倍，故当快指针遍历到链表末尾时，慢指针指向记为中间节点
=end
def middle_node(head)
    slow,fast = head, head

    while fast != nil && fast.next != nil do
        slow = slow.next
        fast = fast.next.next
    end
    slow
end

n1 = ListNode.new(1)
n2 = ListNode.new(2)
n3 = ListNode.new(3)
n4 = ListNode.new(4)
n5 = ListNode.new(5)

n1.next = n2
n2.next = n3
n3.next = n4
n4.next = n5

m_node = middle_node(n1)

p m_node