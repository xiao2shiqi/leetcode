import java.util.Arrays;

/**
 * 剑指 Offer 06：从尾到头打印链表
 * Link：https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 * 思路（最优解）：1次遍历统计链表长度，倒序遍历将链表元素插入数组
 */
public class PO6 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static int[] reversePrint(ListNode head) {
        int count = 0;
        ListNode prev = head;
        while (prev != null) {
            count++;
            prev = prev.next;
        }

        int[] result = new int[count];
        while (count != 0) {
            result[count - 1] = head.val;
            head = head.next;
            count--;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(2);

        n1.next = n2; n2.next = n3;
        int[] ints = PO6.reversePrint(n1);
        System.out.println(Arrays.toString(ints));
    }
}
