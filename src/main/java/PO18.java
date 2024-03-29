/**
 * 剑指 Offer 18：删除链表的节点
 * Link：https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/
 * 这道题跟 LC#237 极度相似，但是相对复杂很多，这是这里 head 参数是头节点， LC#237 传入参数为当前节点
 * 思路：首选判断头指针为当前节点的情况，如果是头指针，处理起来就很方便
 * 接下来通过遍历链表，找到目标节点的上一个节点，既 currentPrevNode 引用
 * 处理 currentPrevNode 引用会出现两种情况：
 * 1 存在 next.next 节点，需要将 next 节点的更新为 next.next 节点，完成删除操作
 * 2 目标节点为最末尾的节点，要删除节点，为末尾节点，直接将当前引用的 next 引用删除即可 currentPrevNode.next = null
 */
public class PO18 {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) {
            return head.next;
        }
        ListNode currentPrevNode = null;
        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
                currentPrevNode = prev;
                break;
            }
            prev = prev.next;
        }
        ListNode nextNode = currentPrevNode.next;
        if (nextNode.next == null) {
            currentPrevNode.next = null;
        } else {
            nextNode.val = nextNode.next.val;
            nextNode.next = nextNode.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next = n2; n2.next = n3;

        ListNode listNode = PO18.deleteNode(n1, 2);
        System.out.println(listNode);
    }
}
