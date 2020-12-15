package algorithms.java.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * LC#160. Intersection of Two Linked Lists 相交链表
 * Link：https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 * 思路1：通过两次嵌套循环链表，暴力匹配，时间复杂度 O(n2)，效率太低，故不写实现代码了
 * 思路2：依次将链表A，B 放入 Set集合，当判断 Set.hasKey 则返回当前链表对象，可以通过提交测试，但是时间和空间效率不理想
 * 思路3（runtime beats 最优解）：使用 pA,pB 分别初始化为 A, B 链表遍历，当 pA 到达尾部时重定向到链表 B 头， pB 指针也类似操作
 * 这道题最巧妙的地方在于，重定向链表后 pA, pB 要走的路是相同的，如果有相交，必然会相同的点遇见，若链表不相交，则最终在 Null 点返回结果
 *
 */
public class IntersectionOfTwoLinkedLists {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA, pB = headB;
        while(pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }

    public static void main(String[] args) {

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next = n2; n2.next = n3;

        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        n4.next = n5; n5.next = n6;

        ListNode result = IntersectionOfTwoLinkedLists.getIntersectionNode(n1, n4);
        System.out.println("result=" + result);
    }
}
