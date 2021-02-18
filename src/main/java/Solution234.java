/**
 * LC#234 回文链表 Palindrome Linked List
 * Link：https://leetcode-cn.com/problems/palindrome-linked-list/
 * 要求：O(n) 时间，O(1) 空间
 * 思路（最优解）：
 * Step1：通过快慢指针，获取链表中间元素
 * Step2：从中间节点开始反转链表
 * Step3：根据反转后的链表开始匹配
 */
public class Solution234 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }

        // Step1：通过快慢指针，获取链表中间元素
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        // Step2：从中间节点开始反转链表
        ListNode prev = null;
        while (slow != null) {
            ListNode nextTemp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextTemp;
        }
        // Step3：根据反转后的链表开始匹配
        while (prev != null && head != null) {
            if (prev.val != head.val) {
                return false;
            }
            prev = prev.next;
            head = head.next;
        }
        return true;
    }


    public static void main(String[] args) {

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
//        ListNode n25 = new ListNode(3);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(1);

        n1.next = n2;
//        n2.next = n25;
//        n25.next = n3;
        n2.next = n3;
        n3.next = n4;

        boolean palindrome = Solution234.isPalindrome(n1);
        System.out.println("palindrome result:" + palindrome);
    }

}

