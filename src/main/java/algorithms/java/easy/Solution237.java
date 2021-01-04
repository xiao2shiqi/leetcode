package algorithms.java.easy;

/**
 * LC#237 删除链表中的节点 Delete node in a Linked List
 * Link：https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 * 思路：删除当前节点，并且不是末尾节点，那么直接将当前节点移动到下一个引用即可
 * @author Phoenix on 2020/12/29 12:48 下午
 */

public class Solution237 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(4);
        ListNode n2 = new ListNode(5);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(9);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Solution237.deleteNode(n2);

        System.out.println(n1);
        System.out.println(n1);
    }
}
