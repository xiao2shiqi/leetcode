package algorithms.java.easy;

/**
 * LC#203 移除链表元素 Remove Linked List Elements
 * Link：https://leetcode-cn.com/problems/remove-linked-list-elements/
 * 思路1（optimum solution 最优解）：初始化 prev,curr 双指针，遍历检查链表 head 链表，判断 curr.val == val 就放弃当前引用，指向下一个引用 prev.next = curr.next，然后移动当前指针，持续循环
 * 感受：这道题思路很简单，就跟删除数组元素差不多，但是用代码实现链表指来指去的引用，如果不常练习链表的话，就算有思路，还是很难快速用代码实现链表，就像这道题在实现上卡了很久，最后还是参观的官方的实现代码
 */
public class Solution203 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode prev = sentinel, curr = head;
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        return sentinel.next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        // 移除指定元素
        ListNode removeElements = removeElements(n1, 6);
        System.out.println(removeElements);
    }
}
