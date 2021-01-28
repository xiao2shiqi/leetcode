/**
 * #83. Remove Duplicates from Sorted List
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 *
 * 解题思路：时间复杂度 O(n)
 *  1 当前元素跟下个元素对比
 *  2 相等移动当前元素的下个元素指针
 *  3 不相等移动当前元素指针
 */
public class Solution83 {

    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode node = head;
        while (node.next != null) {
            if(node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            this.val = x;
        }

    }

    public static void printAll(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(2);
        n1.next.next = new ListNode(2);
        printAll(n1);
        System.out.println(">>>");
        printAll(deleteDuplicates(n1));
    }
}
