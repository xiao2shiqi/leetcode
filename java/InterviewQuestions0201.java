import java.util.HashSet;

/**
 * 面试题：02.01 移除重复节点
 * Link：https://leetcode-cn.com/problems/remove-duplicate-node-lcci/
 * 思路：哈希排重复
 */
public class InterviewQuestions0201 {

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

    public static ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) {
            return null;
        }
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(head.val);
        ListNode moveNode = head;
        while (moveNode.next != null) {
            ListNode cur = moveNode.next;
            if (hashSet.add(cur.val)) {
                moveNode = moveNode.next;
            } else {
                moveNode.next = moveNode.next.next;
            }
        }
        moveNode.next = null;
        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(2);
        ListNode n5 = new ListNode(1);
        n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5;

        ListNode listNode = removeDuplicateNodes(n1);
        System.out.println(listNode);
    }
}
