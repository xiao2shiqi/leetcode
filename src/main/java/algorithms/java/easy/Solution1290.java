package algorithms.java.easy;

/**
 * LC#1290 Convert Binary Number in a Linked List to Integer 二进制链表转整数
 * Link：https://leetcode-cn.com/problems/convert-binary-number-in-a-linked-list-to-integer/
 * 思路1：很简单的题，没有使用位运算了，直接把把链表拼接起来，然后通过 valueOf 转换为十进制，感觉效率也很高
 */
public class Solution1290 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static int getDecimalValue(ListNode head) {
        StringBuilder stringBuilder = new StringBuilder();
        while (head != null) {
            stringBuilder.append(head.val);
            head = head.next;
        }

        return Integer.valueOf(stringBuilder.toString(), 2);
    }


    public static void main(String[] args) {
        // 二进制转换
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(0);
        ListNode n3 = new ListNode(1);

        n1.next = n2; n2.next = n3;
        int decimalValue = Solution1290.getDecimalValue(n1);
        System.out.println("decimalValue :" + decimalValue);
    }
}
