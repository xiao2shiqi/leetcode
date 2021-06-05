/**
 * LC#876 链表的中间结点 Middle of the Linked List
 * Link：https://leetcode-cn.com/problems/middle-of-the-linked-list/
 * 解法1：先统计链表长度 len，计算中间元素位置，再次遍历 head 返回中间元素 ListNode
 * 解法2：利用快慢指针，快指针每次走两步，慢指针每次走一步，所以快指针走的距离为慢指针的两倍，故当快指针遍历到链表末尾时，慢指针指向记为中间节点
 */
public class S876 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode middleNode(ListNode head) {
        // 解法 1
//        int len = 0;
//        ListNode headRe = head;
//        while (headRe != null) {
//            len++;
//            headRe = headRe.next;
//        }
//        int startIndex = 1;
//        while (head != null) {
//            if (startIndex == len / 2 + 1) return head;
//            startIndex ++;
//            head = head.next;
//        }
//        return null;

        // 解法 2
        ListNode slowP = head;
        ListNode fastP = head;
        while (fastP != null && fastP.next != null) {
            slowP = slowP.next;
            fastP = fastP.next.next;
        }
        return slowP;
    }

    public static void main(String[] args) {
        // 将链表连起来
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);

        // 初始化链表
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;

        ListNode node = middleNode(n1);
        System.out.println("value result : " + node.val);

    }
}