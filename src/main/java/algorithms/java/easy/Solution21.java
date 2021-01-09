package algorithms.java.easy;

/**
 * LC#21: Merge Two Sorted Lists
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 * 思路：
 * step1：创建新链表使用 -1 占位
 * step2：使用 prev 指针根据遍历顺序改变 next 引用
 * step3：判断链表参数，将还未遍历完的链表加入到 prev.next 引用
 */
public class Solution21 {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode preNode = new ListNode(-1);
        ListNode prev = preNode;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        if (l1 != null) {prev.next = l1;}
        if (l2 != null) {prev.next = l2;}
        return preNode.next;
    }

    /**
     * 定义链表节点
     */
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int data, ListNode next) {
            this.val = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args) {
        //建立链表
        ListNode n1 = new ListNode(4, null);
        ListNode n2 = new ListNode(2, n1);
        ListNode n3 = new ListNode(1, n2);

        ListNode n4 = new ListNode(4, null);
        ListNode n5 = new ListNode(3, n4);
        ListNode n6 = new ListNode(1, n5);
        ListNode n7 = new ListNode(0, n6);


        ListNode mergeNode = Solution21.mergeTwoLists(n3, n7);
        System.out.println(mergeNode);

    }
}