/**
 * LC#206：反转链表 ReverseLinkedList，题目类型： Linked List
 * Link https://leetcode-cn.com/problems/reverse-linked-list/
 * 思路（最优解）：使用2个对象，next pre 记录当前 head 的头尾节点，通过 head.next = pre 将指针反转，然后再将当前指针移动到 next，无限循环，时间复杂度是线性的 O(n)
 * 备注：
 * 用 java 操作链表比较方便，就用 java 来写了，链表的反转思路很简单，难的是通过代码操作跳来跳去的指针，做链表的题目比较考验对象和引用的理解
 * 做完题目后看了一下官方的解法，这种迭代更改指针应该就是这道题目的最优解法了，
 * 看了其他的版本，貌似还有一种可以通过递归的解法，但是不仅代码复杂，而且使用递归存在隐藏的栈开销（空间复杂度更高），故不做推荐，所以也不深究了
 */
public class S206 {

    public static ListNode reverseList(ListNode head) {
        ListNode next, pre = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }


    /**
     * 链表对象
     */
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args) {
        // 构造1个单向列表
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);

        n1.next = n2;
        n2.next = n3;

        System.out.println(n1);
        n1 = S206.reverseList(n1);
        System.out.println(n1);
    }

}