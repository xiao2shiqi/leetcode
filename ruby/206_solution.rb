# Definition for singly-linked list.
class ListNode
    attr_accessor :val, :next
    def initialize(val)
        @val = val
        @next = nil
    end
end

=begin
LC#206：反转链表 ReverseLinkedList，题目类型： Linked List
Link https://leetcode-cn.com/problems/reverse-linked-list/
 思路（optimum solution 最优解 ）反转公式
 1 将当前 next 指针引用传递给 cur_next
 2 将当前 pre 引用传递给 head.next 实现反转
 3 移动 pre 指针为当前 head 引用
 4 移动 head 为 next 的指针实现遍历
 备注：使用动态语言反转链表，语法简短到没朋友....
=end
def reverse_list(head)
    while(!head.nil?) 
        cur_next, head.next, pre = head.next, pre, head
        head = cur_next
    end
    pre
end

n1 = ListNode.new(1)
n2 = ListNode.new(2)
n3 = ListNode.new(3)

n1.next = n2
n2.next = n3

new_list = reverse_list(n1)

p n1
p new_list