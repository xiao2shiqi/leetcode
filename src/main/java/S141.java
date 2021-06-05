/**
 * LC#141 环形链表
 * Link：https://leetcode-cn.com/problems/linked-list-cycle/
 * 思路1 数组记录法：遍历链表，使用数组 array list 记录经过的链表，判断如果数组 contains(head) 则代表链表有环，解法有效，但是时间和空间的效率都很低
 * 思路2 快慢指针（龟兔赛跑）：通过快慢指针 slow/fast 共同向前移动，如果链表有环，slow/fast 指针必然会撞见，所以判断 slow == fast 返回 true，空间复杂度（常数），时间复杂度（线性）
 */
public class S141 {

    static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }

    public boolean hasCycle(ListNode head) {
//        List<ListNode> linkList = new ArrayList<>();
//        while (head != null) {
//            if (linkList.contains(head)) return true;
//            linkList.add(head);
//            head = head.next;
//        }

        if (head == null || head.next == null) return false;

        // 快慢指针
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public static void main(String[] args) {

        // 构造一个环形链表
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
//        n4.next = n2;

        S141 linkedListCycle = new S141();
        System.out.println("cycle：" + linkedListCycle.hasCycle(n1));
    }

}