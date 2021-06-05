/**
 * 剑指 Offer 22. 链表中倒数第k个节点
 * Link：https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 * 思路1（简单）：先计算链表长度，算出 length - k 得出起始位置，直接返回 length - k 位置即可
 * 思路2：使用 former 指针首先向前走 k 步，然后同时移动 former, latter 指针，当 former 为 null 时返回 latter 指针即可
 */
public class PO22 {

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

    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode former = head;
        ListNode latter = head;
        for(int i = 0; i < k; i++) {
            former = former.next;
        }
        while(former != null) {
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5;

        ListNode listNode = getKthFromEnd(n1, 2);
        System.out.println(listNode);
    }

}
